package com.yunding.netty.ydprint;

import com.yunding.netty.ydprint.Server.PrintServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NettyprintApplication {

	public static void main(String[] args) {
		PrintServer.startServer("127.0.0.1", 8088);
	}
}
