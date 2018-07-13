package com.yunding.netty.ydprint.api.bean;

/**
 * Created by Administrator on 2018/7/13.
 */
public class OrderSearchData {

    private String orderId; // 订单编号

    public OrderSearchData() {
    }

    public OrderSearchData(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
