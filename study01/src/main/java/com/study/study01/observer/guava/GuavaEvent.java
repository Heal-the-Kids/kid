package com.study.study01.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class GuavaEvent {

    @Subscribe
    public void subscribe(String str){
        System.out.println("执行subscribe方法，传入的参数是：" + str);
    }

}
