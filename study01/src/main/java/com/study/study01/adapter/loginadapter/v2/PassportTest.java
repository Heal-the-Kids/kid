package com.study.study01.adapter.loginadapter.v2;

import org.springframework.aop.framework.adapter.AdvisorAdapter;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HandlerAdapter;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class PassportTest {

    public static void main(String[] args) {

        IPassportForThird passportForThird = new PassportForThirdAdapter();

        passportForThird.loginForQQ("");


    }

}
