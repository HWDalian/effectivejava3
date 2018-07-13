package com.yunding.netty.ydprint.handler;

import com.yunding.netty.ydprint.api.bean.OrderInfo;
import com.yunding.netty.ydprint.api.bean.OrderSearchData;
import com.yunding.netty.ydprint.common.utils.IMessageHandler;
import com.yunding.netty.ydprint.common.utils.MessageOutput;
import com.yunding.netty.ydprint.dao.OrderDao;
import io.netty.channel.ChannelHandlerContext;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 获取打印订单信息
 */
public class PrintFindOrder implements IMessageHandler<OrderSearchData> {

    private Logger logger = Logger.getLogger(PrintFindOrder.class);

    private OrderDao dao;

    @Override
    public void handle(ChannelHandlerContext ctx, String requestId, OrderSearchData message) {

        logger.info("find order id : " + message.getOrderId());

        System.out.println("dao " + dao);

        OrderInfo result = new OrderInfo();
        try {
            result = dao.findOrderByOrderId(Integer.parseInt(message.getOrderId()));

        }  catch (Exception e) {
            result.setAddress("系统错误，请稍后再试");
        } finally {
            // add by jiangyue at 2018/07/04 start
            logger.info("method : getorderzd end");
            // add by jiangyue at 2018/07/04 end
        }
        logger.info("success!" + result.toString());
        ctx.writeAndFlush(new MessageOutput(requestId, "order_res", result));
    }
}
