package com.yunding.netty.ydprint;

import com.yunding.netty.ydprint.api.bean.OrderInfo;
import com.yunding.netty.ydprint.api.bean.OrderSearchData;
import com.yunding.netty.ydprint.client.RPCClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NettyprintApplicationTests {


	@Test
	public void contextLoads() throws InterruptedException {

		RPCClient client = new RPCClient("localhost", 8888);
		client.rpc("order_res", OrderInfo.class);
		System.out.println("OrderResult : " + (OrderInfo)client.send("order", new OrderSearchData("144480869778")));

	}

}
