package com.study.study01.stratege.promotion;
/**
 * 无优惠
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class EmptyStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
