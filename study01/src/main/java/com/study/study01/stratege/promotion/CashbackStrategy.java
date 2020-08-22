package com.study.study01.stratege.promotion;

/**
 * 返现
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class CashbackStrategy implements PromotionStrategy {

    public void doPromotion() {
        System.out.println("返现促销,返回的金额转到支付宝账号");
    }
}
