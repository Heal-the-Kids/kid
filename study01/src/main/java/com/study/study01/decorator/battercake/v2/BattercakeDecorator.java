package com.study.study01.decorator.battercake.v2;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public abstract class BattercakeDecorator extends Battercake {

    //静态代理，委派
    private Battercake battercake;

    public BattercakeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }

    protected abstract void doSomething();

    @Override
    protected String getMsg() {
        return this.battercake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.battercake.getPrice();
    }
}
