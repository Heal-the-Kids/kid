package com.study.study01.stratege.promotion;

/**
 * 优惠券
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class CouponStrategy implements PromotionStrategy {

    public void doPromotion() {
        System.out.println("领取优惠券,课程的价格直接减优惠券面值抵扣");
    }
}
