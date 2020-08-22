package com.study.study01.proxy.dynamicproxy.gpproxy;
import com.study.study01.proxy.Person;
import com.study.study01.proxy.dynamicproxy.jdkproxy.Girl;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class GPProxyTest {

    public static void main(String[] args) {
        try {

            //JDK动态代理的实现原理
            Person obj = (Person) new GPMeipo().getInstance(new Girl());
            System.out.println(obj.getClass());
            obj.findLove();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
