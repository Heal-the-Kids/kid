package com.study.study01.decorator.battercake.v1;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class BattercakeTest {
    public static void main(String[] args) {

        Battercake battercake = new Battercake();
        System.out.println(battercake.getMsg() + ",总价格：" + battercake.getPrice());

        Battercake battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getMsg() + ",总价格：" + battercakeWithEgg.getPrice());

        Battercake battercakeWithEggAndSausage = new BattercakeWithEggAndSausage();
        System.out.println(battercakeWithEggAndSausage.getMsg() + ",总价格：" + battercakeWithEggAndSausage.getPrice());

    }

}
