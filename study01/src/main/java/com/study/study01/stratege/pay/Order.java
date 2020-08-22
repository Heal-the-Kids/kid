package com.study.study01.stratege.pay;

import com.study.study01.stratege.pay.payport.PayStrategy;
import com.study.study01.stratege.pay.payport.Payment;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class Order {
    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid,String orderId,double amount){
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    //完美地解决了1switch的过程，不需要在代码逻辑中写switch了
    //更不需要写if    else if
    public MsgResult pay(){
        return pay(PayStrategy.DEFAULT_PAY);
    }

    public MsgResult pay(String payKey){
        Payment payment = PayStrategy.get(payKey);
        System.out.println("欢迎使用" + payment.getName());
        System.out.println("本次交易金额为：" + amount + "，开始扣款...");
        return payment.pay(uid,amount);
    }
}
