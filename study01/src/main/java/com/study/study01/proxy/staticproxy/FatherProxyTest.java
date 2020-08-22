package com.study.study01.proxy.staticproxy;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class FatherProxyTest {

    public static void main(String[] args) {

        Father father = new Father(new Son());
        father.findLove();

        //农村，媒婆
        //婚介所

        //大家每天都在用的一种静态代理的形式
        //对数据库进行分库分表
        //ThreadLocal
        //进行数据源动态切换
    }

}
