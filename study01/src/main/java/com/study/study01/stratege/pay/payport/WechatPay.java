package com.study.study01.stratege.pay.payport;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class WechatPay extends Payment {

    public String getName() {
        return "微信支付";
    }

    protected double queryBalance(String uid) {
        return 256;
    }

}
