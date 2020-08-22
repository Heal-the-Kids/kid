package com.study.study01.adapter.loginadapter.v1;


import com.study.study01.adapter.loginadapter.v1.service.SinginForThirdService;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class SiginForThirdServiceTest {
    public static void main(String[] args) {
        SinginForThirdService service = new SinginForThirdService();
        service.login("tom","123456");
        service.loginForQQ("sdfasdfasf");
        service.loginForWechat("sdfasfsa");
    }
}
