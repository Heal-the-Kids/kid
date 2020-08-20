package com.study.study01.single;

/**
 * @Auther: kid
 * @Date: 2020/8/20 22:19
 * @Description:
 */
public class LazySimpleSingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");
    }
}
