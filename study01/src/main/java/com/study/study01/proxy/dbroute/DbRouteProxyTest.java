package com.study.study01.proxy.dbroute;

import com.study.study01.proxy.dbroute.proxy.OrderServiceDynamicProxy;
import com.study.study01.proxy.dbroute.proxy.OrderServiceStaticProxy;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class DbRouteProxyTest {
    public static void main(String[] args) {
        try {
            Order order = new Order();

//            order.setCreateTime(new Date().getTime());

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2017/02/01");
            order.setCreateTime(date.getTime());

            IOrderService orderService = (IOrderService)new OrderServiceDynamicProxy().getInstance(new OrderService());
//            IOrderService orderService = (IOrderService)new OrderServiceStaticProxy(new OrderService());
            orderService.createOrder(order);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
