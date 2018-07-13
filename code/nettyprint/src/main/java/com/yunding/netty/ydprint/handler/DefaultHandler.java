package com.yunding.netty.ydprint.handler;

import com.yunding.netty.ydprint.common.utils.IMessageHandler;
import com.yunding.netty.ydprint.common.utils.MessageInput;
import io.netty.channel.ChannelHandlerContext;

/**
 * Created by Administrator on 2018/7/12.
 */
public class DefaultHandler implements IMessageHandler<MessageInput> {

    @Override
    public void handle(ChannelHandlerContext ctx, String requestId, MessageInput message) {
        System.out.println("unrecognized message type=" + message.getType() + " comes");
        ctx.close();
    }
}
