package com.study.study01.decorator.battercake.v1;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class BattercakeWithEggAndSausage extends BattercakeWithEgg{
    @Override
    protected String getMsg() {
        return super.getMsg() + "+1根香肠";
    }

    @Override
    //加一个香肠加2块钱
    public int getPrice() {
        return super.getPrice() + 2;
    }
}
