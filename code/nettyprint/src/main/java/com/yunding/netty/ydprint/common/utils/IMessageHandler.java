package com.yunding.netty.ydprint.common.utils;

import io.netty.channel.ChannelHandlerContext;

@FunctionalInterface
public interface IMessageHandler<T> {

	void handle(ChannelHandlerContext ctx, String requestId, T message);

}
