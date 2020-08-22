package com.study.study01.stratege.pay.payport;


/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class AliPay extends Payment {

    public String getName() {
        return "支付宝";
    }

    protected double queryBalance(String uid) {
        return 900;
    }

}
