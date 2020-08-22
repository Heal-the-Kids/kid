package com.study.study01.decorator.battercake.v2;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class BaseBattercake extends Battercake {
    protected String getMsg(){
        return "煎饼";
    }

    public int getPrice(){
        return 5;
    }
}
