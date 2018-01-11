package cn.com.tcsl.crm7demo;

/**
 * 描述:
 * <p/>作者：wjx
 * <p/>创建时间: 2018/1/11 10:46
 */
public class CoupBean {
    private String couponType;
    private String couponId;
    private String couponCode;
    private float couponUseMoney;

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public float getCouponUseMoney() {
        return couponUseMoney;
    }

    public void setCouponUseMoney(float couponUseMoney) {
        this.couponUseMoney = couponUseMoney;
    }

    @Override
    public String toString() {
        return "CoupBean{" +
                "couponType='" + couponType + '\'' +
                ", couponId='" + couponId + '\'' +
                ", couponCode='" + couponCode + '\'' +
                ", couponUseMoney=" + couponUseMoney +
                '}';
    }
}
