package com.yunding.netty.ydprint.handler;

import com.yunding.netty.ydprint.common.utils.IMessageHandler;
import com.yunding.netty.ydprint.common.utils.MessageOutput;
import io.netty.channel.ChannelHandlerContext;

/**
 * Created by Administrator on 2018/7/12.
 */
public class HelloHandler implements IMessageHandler<String> {
    @Override
    public void handle(ChannelHandlerContext ctx, String requestId, String message) {
        ctx.writeAndFlush(new MessageOutput(requestId, "helloNettyRes", "hello world " + message));
    }
}
