package com.yunding.netty.ydprint.common.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/7/13.
 */
@Component
@ConfigurationProperties(prefix = "netty")
public class NettyConfig {

    private int port;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

}
