package com.study.study01.decorator.passport;

import com.study.study01.decorator.passport.old.SigninService;
import com.study.study01.decorator.passport.upgrade.ISiginForThirdService;
import com.study.study01.decorator.passport.upgrade.SiginForThirdService;
//import org.springframework.cache.transaction.TransactionAwareCacheDecorator;
import org.springframework.http.server.reactive.HttpHeadResponseDecorator;

import java.io.BufferedReader;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class DecoratorTest {

    public static void main(String[] args) {

        //满足一个is-a
        ISiginForThirdService siginForThirdService = new SiginForThirdService(new SigninService());
        siginForThirdService.loginForQQ("sdfasfdasfsf");

    }


}
