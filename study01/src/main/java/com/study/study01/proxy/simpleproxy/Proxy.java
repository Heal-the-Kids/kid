package com.study.study01.proxy.simpleproxy;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class Proxy implements Subject {

    private Subject subject;

    public Proxy(Subject subject){
        this.subject = subject;
    }


    public void request() {
        before();
        subject.request();
        after();
    }

    public void before(){
        System.out.println("called before request().");
    }

    public void after(){
        System.out.println("called after request().");
    }
}
