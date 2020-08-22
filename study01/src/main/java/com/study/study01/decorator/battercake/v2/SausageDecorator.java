package com.study.study01.decorator.battercake.v2;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class SausageDecorator extends BattercakeDecorator {
    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    protected void doSomething() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
