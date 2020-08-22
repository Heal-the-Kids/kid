package com.study.study01.proxy.dynamicproxy.jdkproxy;

import com.study.study01.proxy.Person;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class Girl implements Person {
    public void findLove() {
        System.out.println("高富帅");
        System.out.println("身高180cm");
        System.out.println("有6块腹肌");
    }
}
