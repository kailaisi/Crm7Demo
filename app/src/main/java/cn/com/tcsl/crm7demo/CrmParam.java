package cn.com.tcsl.crm7demo;

/**
 * 描述:crm7初始化使用的参数
 * <p/>作者：wjx
 * <p/>创建时间: 2018/1/9 14:19
 */
public class CrmParam {

    /**
     * baseUrl : http://192.168.12.40:8093/crm7tocy6api/
     * appId : tcslcy6
     * companyId : 1000001057
     * shopId : 1000000364
     * terminalCode : 100000036404
     * accessToken :
     * succTipFun : this.showSuccTip
     * errTipFun : this.showErrTip
     * device : mobile
     * cyVersion :
     */

    private String baseUrl;
    private String appId;
    private String companyId;
    private String shopId;
    private String terminalCode;
    private String accessToken = "";
    private String device = "mobile";
    private String cyVersion = "1.0.1";
    private String cardNo = "13621000102";
    private int product = 2;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getTerminalCode() {
        return terminalCode;
    }

    public void setTerminalCode(String terminalCode) {
        this.terminalCode = terminalCode;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getCyVersion() {
        return cyVersion;
    }

    public void setCyVersion(String cyVersion) {
        this.cyVersion = cyVersion;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }
}
