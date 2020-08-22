package com.study.study01.proxy.simpleproxy;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("real service is called.");
    }
}
