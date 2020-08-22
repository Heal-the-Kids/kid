package com.study.study01.decorator.passport.old;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public interface ISigninService {
    ResultMsg regist(String username, String password);


    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    ResultMsg login(String username, String password);
}
