package com.yunding.netty.ydprint.service;

/**
 * Created by Administrator on 2018/7/10.
 */
public class HelloServiceImpl implements HelloService{
    @Override
    public String Hello(String args) {

        return args != null ? args + " -------> I am fine." : "I am fine.";

    }
}
