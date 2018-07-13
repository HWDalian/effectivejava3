package com.yunding.netty.ydprint.common.utils;

import java.util.UUID;

public class RequestId {

	public static String next() {
		return UUID.randomUUID().toString();
	}

}
