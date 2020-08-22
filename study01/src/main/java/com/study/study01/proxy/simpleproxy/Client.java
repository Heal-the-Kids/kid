package com.study.study01.proxy.simpleproxy;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class Client {

    public static void main(String[] args) {

        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();

    }

}
