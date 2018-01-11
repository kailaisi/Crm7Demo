package cn.com.tcsl.crm7demo;

/**
 * 描述:
 * <p/>作者：wjx
 * <p/>创建时间: 2018/1/10 14:35
 */
public class BaseCrm<T> {
    public T data;

    public BaseCrm(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
