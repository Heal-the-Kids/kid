package com.study.study01.stratege.promotion;

/**
 * 优惠活动
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void execute(){
        promotionStrategy.doPromotion();
    }

}
