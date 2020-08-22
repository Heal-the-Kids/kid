package com.study.study01.stratege.pay.payport;


/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class JDPay extends Payment {

    public String getName() {
        return "京东白条";
    }

    protected double queryBalance(String uid) {
        return 500;
    }
}
