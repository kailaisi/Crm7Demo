package cn.com.tcsl.crm7demo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.Reader;

/**
 * 描述:Json工具类
 * <p/>作者：吴永弘
 * <br/>创建时间: 2017/2/22 10:19
 */
public class JsonUtils {

    private JsonUtils() {
    }

    /**
     * 将json解析为bean
     *
     * @param <T>     要转换的业务Bean类型
     * @param jsonStr json串
     * @param clazz   想要转换成的类型的class
     * @param <T>     要转换的业务Bean类型
     * @return T的实例
     */
    public static final <T> T parseJson(String jsonStr, Class<T> clazz) {
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        TypeToken<T> token = TypeToken.get(clazz);
        return gson.fromJson(jsonStr, token.getType());
    }

    /**
     * 将json解析为bean
     *
     * @param jsonStr json串
     * @param token   想要转换成的类型的TypeToken，如List&lt;Bean&gt;
     * @param <T>     要转换的业务Bean类型
     * @return T的实例
     */
    public static final <T> T parseJson(String jsonStr, TypeToken<T> token) {
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(jsonStr, token.getType());
    }

    /**
     * 将json解析为bean （用于读取演示模式json文件）
     *
     * @param reader
     * @param token
     * @param <T>
     * @return
     */
    public static final <T> T parseJson(Reader reader, TypeToken<T> token) {
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(reader, token.getType());
    }

    /**
     * 将json解析为bean
     *
     * @param reader
     * @param clazz
     * @param <T>
     * @return
     */
    public static final <T> T parseJson(Reader reader, Class<T> clazz) {
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        TypeToken<T> token = TypeToken.get(clazz);
        return gson.fromJson(reader, token.getType());
    }

    /**
     * 生成json
     *
     * @param t   要转换的bean的实例
     * @param <T> 用于生成json的业务Bean的类型
     * @return Json字符串
     */
    public static final <T> String createJson(T t) {
        Gson gson = new GsonBuilder().serializeNulls().create();
        return gson.toJson(t);
    }


}
