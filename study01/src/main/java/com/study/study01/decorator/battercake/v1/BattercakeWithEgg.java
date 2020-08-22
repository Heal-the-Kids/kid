package com.study.study01.decorator.battercake.v1;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class BattercakeWithEgg extends Battercake{
    @Override
    protected String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    //加一个鸡蛋加1块钱
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
