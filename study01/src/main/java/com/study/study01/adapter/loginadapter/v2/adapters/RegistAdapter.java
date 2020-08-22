package com.study.study01.adapter.loginadapter.v2.adapters;


import com.study.study01.adapter.loginadapter.ResultMsg;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public interface RegistAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id, Object adapter);
}
