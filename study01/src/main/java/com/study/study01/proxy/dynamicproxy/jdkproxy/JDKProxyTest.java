package com.study.study01.proxy.dynamicproxy.jdkproxy;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Method;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class JDKProxyTest {

    public static void main(String[] args) {
        try {

            Object obj = new JDKMeipo().getInstance(new Girl());
            Method method = obj.getClass().getMethod("findLove",null);
            method.invoke(obj);

            //obj.findLove();

            //$Proxy0
//            byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
//            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
//            os.write(bytes);
//            os.close();

        }catch (Exception e){
            e.printStackTrace();
        }



    }

}
