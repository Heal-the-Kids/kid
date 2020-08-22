package com.study.study01.stratege.promotion;

/**
 * 拼团优惠
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class GroupbuyStrategy implements PromotionStrategy{

    public void doPromotion() {
        System.out.println("拼团，满20人成团，全团享受团购价");
    }
}
