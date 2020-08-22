package com.study.study01.adapter.loginadapter.v1.service;


import com.study.study01.adapter.loginadapter.Member;
import com.study.study01.adapter.loginadapter.ResultMsg;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class SiginService {

    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg regist(String username, String password){
        return  new ResultMsg(200,"注册成功",new Member());
    }


    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username,String password){
        System.out.println("登录成功");
        return null;
    }

}
