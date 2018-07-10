package com.yunding.netty.ydprint;

import com.yunding.netty.ydprint.rpc.RpcConsumer;
import com.yunding.netty.ydprint.service.HelloService;
import com.yunding.netty.ydprint.utils.ClientBootstrap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NettyprintApplicationTests {

	@Test
	public void contextLoads() throws InterruptedException {
		RpcConsumer consumer = new RpcConsumer();
		// 创建一个代理对象
		HelloService service = (HelloService) consumer
				.createProxy(HelloService.class, ClientBootstrap.providerName);
		for (; ; ) {
			Thread.sleep(1000);
			System.out.println(service.Hello("are you ok ?"));
		}
	}

}
