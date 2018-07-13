package com.yunding.netty.ydprint;

import com.yunding.netty.ydprint.api.bean.OrderSearchData;
import com.yunding.netty.ydprint.dao.OrderDao;
import com.yunding.netty.ydprint.handler.PrintFindOrder;
import com.yunding.netty.ydprint.server.RPCServer;
import io.netty.channel.ChannelFuture;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.jmx.support.RegistrationPolicy;

import java.net.InetSocketAddress;

@Configuration
@SpringBootApplication
@MapperScan("com.yunding.netty.ydprint.dao")
@EnableMBeanExport(registration = RegistrationPolicy.IGNORE_EXISTING)
public class NettyprintApplication {

	public static void main(String[] args) {
		SpringApplication.run(NettyprintApplication.class, args);
		RPCServer server = new RPCServer("127.0.0.1", 8888, 2, 16);
		server.service("order", OrderSearchData.class, new PrintFindOrder());
		server.start();
	}
}