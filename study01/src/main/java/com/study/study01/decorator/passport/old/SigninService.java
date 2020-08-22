package com.study.study01.decorator.passport.old;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class SigninService implements ISigninService {

    public ResultMsg regist(String username,String password){
        return  new ResultMsg(200,"注册成功",new Member());
    }

    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username,String password){
        return null;
    }
}
