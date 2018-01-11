package cn.com.tcsl.crm7demo;

import java.util.ArrayList;

/**
 * 描述:
 * <p/>作者：wjx
 * <p/>创建时间: 2018/1/11 10:41
 */
public class ConsumeBean {
    private String accessToken;
    private String shopId;
    private String terminalCode;
    private String device;
    private String crmTsCode;
    private String cardNo;
    private String password;
    private float billRealMoney;
    private float consumeScore;
    private float consumeMoney;
    private float scoreConverMoney;
    private float allVoucherAmount;
    private float voucherConverMoney;
    private float cardAllMoney;
    private int hasOtherReduction;
    private int isMobileIn;
    private String verifyingCode;
    private ArrayList<ConsumeBean> couponUsed;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
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

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getCrmTsCode() {
        return crmTsCode;
    }

    public void setCrmTsCode(String crmTsCode) {
        this.crmTsCode = crmTsCode;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getBillRealMoney() {
        return billRealMoney;
    }

    public void setBillRealMoney(float billRealMoney) {
        this.billRealMoney = billRealMoney;
    }

    public float getConsumeScore() {
        return consumeScore;
    }

    public void setConsumeScore(float consumeScore) {
        this.consumeScore = consumeScore;
    }

    public float getConsumeMoney() {
        return consumeMoney;
    }

    public void setConsumeMoney(float consumeMoney) {
        this.consumeMoney = consumeMoney;
    }

    public float getScoreConverMoney() {
        return scoreConverMoney;
    }

    public void setScoreConverMoney(float scoreConverMoney) {
        this.scoreConverMoney = scoreConverMoney;
    }

    public float getAllVoucherAmount() {
        return allVoucherAmount;
    }

    public void setAllVoucherAmount(float allVoucherAmount) {
        this.allVoucherAmount = allVoucherAmount;
    }

    public float getVoucherConverMoney() {
        return voucherConverMoney;
    }

    public void setVoucherConverMoney(float voucherConverMoney) {
        this.voucherConverMoney = voucherConverMoney;
    }

    public float getCardAllMoney() {
        return cardAllMoney;
    }

    public void setCardAllMoney(float cardAllMoney) {
        this.cardAllMoney = cardAllMoney;
    }

    public int getHasOtherReduction() {
        return hasOtherReduction;
    }

    public void setHasOtherReduction(int hasOtherReduction) {
        this.hasOtherReduction = hasOtherReduction;
    }

    public int getIsMobileIn() {
        return isMobileIn;
    }

    public void setIsMobileIn(int isMobileIn) {
        this.isMobileIn = isMobileIn;
    }

    public String getVerifyingCode() {
        return verifyingCode;
    }

    public void setVerifyingCode(String verifyingCode) {
        this.verifyingCode = verifyingCode;
    }

    public ArrayList<ConsumeBean> getCouponUsed() {
        return couponUsed;
    }

    public void setCouponUsed(ArrayList<ConsumeBean> couponUsed) {
        this.couponUsed = couponUsed;
    }


    @Override
    public String toString() {
        return "ConsumeBean{" +
                "accessToken='" + accessToken + '\'' +
                ", shopId='" + shopId + '\'' +
                ", terminalCode='" + terminalCode + '\'' +
                ", device='" + device + '\'' +
                ", crmTsCode='" + crmTsCode + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", password='" + password + '\'' +
                ", billRealMoney=" + billRealMoney +
                ", consumeScore=" + consumeScore +
                ", consumeMoney=" + consumeMoney +
                ", scoreConverMoney=" + scoreConverMoney +
                ", allVoucherAmount=" + allVoucherAmount +
                ", voucherConverMoney=" + voucherConverMoney +
                ", cardAllMoney=" + cardAllMoney +
                ", hasOtherReduction=" + hasOtherReduction +
                ", isMobileIn=" + isMobileIn +
                ", verifyingCode='" + verifyingCode + '\'' +
                ", couponUsed=" + couponUsed +
                '}';
    }
}
