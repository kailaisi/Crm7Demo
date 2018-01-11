package cn.com.tcsl.crm7demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private static final String TAG = "MainActivity2";
    private EditText et;
    private Button btn;
    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        WebSettings setting = mWebView.getSettings();
        setting.setJavaScriptEnabled(true);
        setting.setSavePassword(false);
        mWebView.setWebChromeClient(new WebChromeClient() {
            @Override//实现js中的alert弹窗在Activity中显示
            public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
                Log.d(TAG, message);
                result.confirm();
                return true;
            }
        });
        Gson gson = new Gson();
        mWebView.addJavascriptInterface(new AndroidJavaScript(), "JsCRM7");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadurl();
            }
        });
        loadurl();
        String setting1 = "{\n" +
                "    \"billRealMoney\": 150,\n" +
                "    \"cardShouldPay\": 100,\n" +
                "    \"hasOtherReduction\": 0,\n" +
                "    \"itemList\": [\n" +
                "        {\n" +
                "            \"itemClassId\": \"65\",\n" +
                "            \"code\": \"001001002\",\n" +
                "            \"name\": \"青岛啤酒\",\n" +
                "            \"money\": 8,\n" +
                "            \"count\": 2\n" +
                "        },\n" +
                "        {\n" +
                "            \"itemClassId\": \"68\",\n" +
                "            \"code\": \"001004001\",\n" +
                "            \"name\": \"可口可乐（瓶）\",\n" +
                "            \"money\": 4.5,\n" +
                "            \"count\": 4\n" +
                "        }\n" +
                "    ],\n" +
                "    \"itemClassList\": [\n" +
                "        {\n" +
                "            \"code\": \"65\",\n" +
                "            \"classCode\": \"001001\",\n" +
                "            \"className\": \"啤酒\",\n" +
                "            \"count\": 2,\n" +
                "            \"money\": 16\n" +
                "        },\n" +
                "        {\n" +
                "            \"code\": \"68\",\n" +
                "            \"classCode\": \"001004\",\n" +
                "            \"className\": \"饮料\",\n" +
                "            \"count\": 4,\n" +
                "            \"money\": 18\n" +
                "        }\n" +
                "    ]\n" +
                "}";
        String callbackStr = "javascript:crmPageObj.readMemberPriceSucc(" + setting1 + ");";
        Log.d(TAG, callbackStr);
    }

    private void loadurl() {
        String s = et.getText().toString();
        mWebView.loadUrl(s);
    }

    /**
     * 初始化相关参数
     */
    private CrmParam loadCRMParam() {
        CrmParam param = new CrmParam();
        param.setAppId("tcslcy6");
        param.setBaseUrl("http://192.168.12.40:8093/crm7tocy6api/");
        param.setCompanyId("1000001057");
        param.setShopId("1000000364");
        param.setTerminalCode("100000036404");
        return param;
    }

    private void initView() {
        et = (EditText) findViewById(R.id.et);
        btn = (Button) findViewById(R.id.btn);
        mWebView = (WebView) findViewById(R.id.wv);
    }

    /**
     * 描述:android和crm7界面的交互数据
     * js调用本地：支持：1.初始化参数信息  2.查卡以后调用  3.，使用完成以后的卡信息数据
     * 本地调用js: 支持：1.传卡    2.查卡以后，将金额以及品项等信息传给后台
     * <p/>作者：wjx
     * <p/>创建时间: 2018/1/8 15:52
     */
    public class AndroidJavaScript {
        /**
         * 初始化crm参数
         */
        @JavascriptInterface
        public void getData() {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Gson gson = new Gson();
                    String setting = gson.toJson(loadCRMParam());
                    Toast.makeText(MainActivity2.this, setting, Toast.LENGTH_SHORT).show();
                    String callbackStr = "javascript:crmPageObj.setRequestParamsSucc(" + setting + ");";
                    Log.d(TAG, callbackStr);
                    mWebView.loadUrl(callbackStr);
                }
            });
        }


        /**
         * 回传会员卡号，根据卡号，卡型，进行餐饮金额的计算，然后回传给餐饮。
         */
        @JavascriptInterface
        public void readMemberPriceInfoFun(final String cardNo, final String cardType) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Gson gson = new Gson();
                    Log.d(TAG, "cardNo:" + cardNo + ",cardType:" + cardType);
                    String json = gson.toJson(loadCRMVipPrice());
                    String callbackStr = "javascript:crmPageObj.readMemberPriceSucc(" + json + ");";
                    Log.d(TAG, callbackStr);
                    mWebView.loadUrl(callbackStr);

                }
            });
        }

        /**
         * 射频卡和磁条卡接口
         */
        @JavascriptInterface
        public void userMagCard() {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    // TODO: 2018/1/8
                }
            });
        }

        /**
         * 摄像头扫描二维码接口
         */
        @JavascriptInterface
        public void scan() {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    String callbackStr = "javascript:setRequestParam(13622100102);";
                    mWebView.loadUrl(callbackStr);
                }
            });
        }
    }

    private CrmItemBean loadCRMVipPrice() {
        CrmItemBean bean = new CrmItemBean();
        bean.setBillRealMoney(20);
        bean.setCardShouldPay(20);
        bean.setHasOtherReduction(1);
        ArrayList<CrmItemBean.ItemClassListBean> classList = new ArrayList<>();
        CrmItemBean.ItemClassListBean bean1 = new CrmItemBean.ItemClassListBean();
        bean1.setCode("65");
        bean1.setClassCode("001001");
        bean1.setCount(8);
        bean1.setMoney(20);
        classList.add(bean1);
        bean.setItemClassList(classList);
        CrmItemBean.ItemListBean bean2 = new CrmItemBean.ItemListBean();
        bean2.setItemClassId("65");
        bean2.setCode("001001002");
        bean2.setName("雪碧");
        bean2.setMoney(2.5f);
        bean2.setCount(8);
        ArrayList<CrmItemBean.ItemListBean> itemListBeans = new ArrayList<>();
        itemListBeans.add(bean2);
        bean.setItemList(itemListBeans);
        return bean;
    }
}
