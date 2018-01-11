package cn.com.tcsl.crm7demo;

import java.util.List;

/**
 * 描述:将菜品信息传给crm7使用的类
 * <p/>作者：wjx
 * <p/>创建时间: 2018/1/9 10:17
 */
public class CrmItemBean {


    /**
     * billRealMoney : 150
     * cardShouldPay : 100
     * hasOtherReduction : 0
     * itemList : [{"itemClassId":"65","code":"001001002","name":"青岛啤酒","money":8,"count":2}]
     * itemClassList : [{"code":"65","classCode":"001001","className":"啤酒","count":2,"money":16}]
     */

    private float billRealMoney;
    private float cardShouldPay;
    private int hasOtherReduction;
    private List<ItemListBean> itemList;
    private List<ItemClassListBean> itemClassList;

    public float getBillRealMoney() {
        return billRealMoney;
    }

    public void setBillRealMoney(float billRealMoney) {
        this.billRealMoney = billRealMoney;
    }

    public float getCardShouldPay() {
        return cardShouldPay;
    }

    public void setCardShouldPay(float cardShouldPay) {
        this.cardShouldPay = cardShouldPay;
    }

    public int getHasOtherReduction() {
        return hasOtherReduction;
    }

    public void setHasOtherReduction(int hasOtherReduction) {
        this.hasOtherReduction = hasOtherReduction;
    }

    public List<ItemListBean> getItemList() {
        return itemList;
    }

    public void setItemList(List<ItemListBean> itemList) {
        this.itemList = itemList;
    }

    public List<ItemClassListBean> getItemClassList() {
        return itemClassList;
    }

    public void setItemClassList(List<ItemClassListBean> itemClassList) {
        this.itemClassList = itemClassList;
    }

    public static class ItemListBean {
        /**
         * itemClassId : 65
         * code : 001001002
         * name : 青岛啤酒
         * money : 8
         * count : 2
         */

        private String itemClassId;
        private String code;
        private String name;
        private float money;
        private float count;

        public String getItemClassId() {
            return itemClassId;
        }

        public void setItemClassId(String itemClassId) {
            this.itemClassId = itemClassId;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public float getMoney() {
            return money;
        }

        public void setMoney(float money) {
            this.money = money;
        }

        public float getCount() {
            return count;
        }

        public void setCount(float count) {
            this.count = count;
        }
    }

    public static class ItemClassListBean {
        /**
         * code : 65
         * classCode : 001001
         * className : 啤酒
         * count : 2
         * money : 16
         */

        private String code;
        private String classCode;
        private String className;
        private float count;
        private float money;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getClassCode() {
            return classCode;
        }

        public void setClassCode(String classCode) {
            this.classCode = classCode;
        }

        public String getClassName() {
            return className;
        }

        public void setClassName(String className) {
            this.className = className;
        }

        public float getCount() {
            return count;
        }

        public void setCount(float count) {
            this.count = count;
        }

        public float getMoney() {
            return money;
        }

        public void setMoney(float money) {
            this.money = money;
        }
    }
}
