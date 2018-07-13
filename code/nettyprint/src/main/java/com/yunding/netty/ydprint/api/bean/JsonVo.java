package com.yunding.netty.ydprint.api.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2018/7/12.
 */
public class JsonVo<T> implements Serializable {
    /**
     * 结果
     */
    private boolean result;
    /**
     * 成功的消息
     */
    private String msg;

    /**
     * 具体每个输入错误的消息
     */
    private HashMap<String, String> errors = new HashMap<String, String>();

    /**
     * 版本号
     */
    private String version;

    /*
     * 版本号
     */
    private Long versionlong;


    /**
     * 返回的数据
     */
    private T obj;

    /**
     * 返回数据集
     */
    private List<T> list;

    /**
     * 集合记录
     */
    private Integer total;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public boolean getResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public HashMap<String, String> getErrors() {
        return errors;
    }

    public void setErrors(HashMap<String, String> errors) {
        this.errors = errors;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public void check() throws Exception {
        if (this.getErrors().size() > 0) {
            this.setResult(false);
            throw new Exception("有错误发生");
        } else {
            this.setResult(true);
        }
    }

    public void setException(Exception e) {
        this.msg = getMethodName() + e.getMessage();
        e.printStackTrace();
        this.result = false;
    }

    private String getMethodName() {
        try {
            StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
            StackTraceElement e = stacktrace[2];
            String methodName = e.getMethodName();
            return methodName;
        } catch (Exception e) {
            return "func get name is error";
        }

    }

    /**
     * @return
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Long getVersionlong() {
        return versionlong;
    }

    public void setVersionlong(Long versionlong) {
        this.versionlong = versionlong;
    }

    @Override
    public String toString() {
        return "JsonVo{" +
                "result=" + result +
                ", msg='" + msg + '\'' +
                ", errors=" + errors +
                ", version='" + version + '\'' +
                ", versionlong=" + versionlong +
                ", obj=" + obj +
                ", list=" + list +
                ", total=" + total +
                '}';
    }
}
