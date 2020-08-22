package com.study.study01.adapter.loginadapter.v2.adapters;


import com.study.study01.adapter.loginadapter.ResultMsg;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class LoginForSinaAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForSinaAdapter;
    }
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
