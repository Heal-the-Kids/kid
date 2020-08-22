package com.study.study01.stratege.pay.payport;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class UnionPay extends Payment {

    public String getName() {
        return "银联支付";
    }

    protected double queryBalance(String uid) {
        return 120;
    }

}
