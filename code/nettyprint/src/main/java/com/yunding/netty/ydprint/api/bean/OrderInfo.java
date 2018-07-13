package com.yunding.netty.ydprint.api.bean;

/**
 * 订单相关信息
 */
public class OrderInfo {

    private String address; // 学校名称
    private String fileName; // 文件名称
    private String orderSetting; // 订单打印设置(1单双面，2分数，3类型)
    private String toprint; // 要打印的页(以","隔开)1,2,3,5-8
    private String orderId; // 订单号
    private Integer userId; // 用户编号
    private Integer fileId; // 文件编号
    private Integer overpagesize; // 订单打印完成时订单打印的纸张数
    private String fileUrl; // 文件路径
    private Integer fileMode; // 文件横纵向（1纵向，2横向）

    public OrderInfo() {
    }

    public OrderInfo(String address, String fileName, String orderSetting, String toprint, String orderId, Integer userId, Integer fileId, Integer overpagesize, String fileUrl, Integer fileMode) {
        this.address = address;
        this.fileName = fileName;
        this.orderSetting = orderSetting;
        this.toprint = toprint;
        this.orderId = orderId;
        this.userId = userId;
        this.fileId = fileId;
        this.overpagesize = overpagesize;
        this.fileUrl = fileUrl;
        this.fileMode = fileMode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getOrderSetting() {
        return orderSetting;
    }

    public void setOrderSetting(String orderSetting) {
        this.orderSetting = orderSetting;
    }

    public String getToprint() {
        return toprint;
    }

    public void setToprint(String toprint) {
        this.toprint = toprint;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public Integer getOverpagesize() {
        return overpagesize;
    }

    public void setOverpagesize(Integer overpagesize) {
        this.overpagesize = overpagesize;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public Integer getFileMode() {
        return fileMode;
    }

    public void setFileMode(Integer fileMode) {
        this.fileMode = fileMode;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "address='" + address + '\'' +
                ", fileName='" + fileName + '\'' +
                ", orderSetting='" + orderSetting + '\'' +
                ", toprint='" + toprint + '\'' +
                ", orderId='" + orderId + '\'' +
                ", userId=" + userId +
                ", fileId=" + fileId +
                ", overpagesize=" + overpagesize +
                ", fileUrl='" + fileUrl + '\'' +
                ", fileMode=" + fileMode +
                '}';
    }
}
