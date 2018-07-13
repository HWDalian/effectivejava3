package com.yunding.netty.ydprint.dao;

import com.yunding.netty.ydprint.api.bean.OrderInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 订单Dao层
 */
public interface OrderDao {

    /**
     * 获取订单信息
     * @param orderid
     * @return
     */
    @Select("SELECT" +
            "o.order_setting AS orderSetting," +
            "o.order_id AS orderId," +
            "o.user_id AS userId," +
            "o.toprint," +
            "o.overpagesize AS overpagesize," +
            "f.file_name AS fileName," +
            "f.file_id AS fileId," +
            "f.file_pdfurl AS fileUrl," +
            "a.SchoolName AS address," +
            "f.file_mode AS fileMode" +
            "FROM" +
            "yd_order AS o" +
            "INNER JOIN yd_user AS u ON u.user_id = o.user_id" +
            "INNER JOIN yd_userforprint AS pu ON pu.UserId = o.order_id" +
            "INNER JOIN yd_file AS f ON f.file_id = o.file_id" +
            "INNER JOIN yd_addrschool AS a ON a.SchoolID = o.order_school" +
            "INNER JOIN yd_printer AS p ON p.id=o.printer_id" +
            "WHERE" +
            "o.order_id = #{orderid} and o.overpagesize != 0" +
            "order by o.id desc" +
            "limit 1")
    public OrderInfo findOrderByOrderId(@Param(value = "orderid") Integer orderid);

}
