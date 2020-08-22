package com.study.study01.delegate;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class Boss {

    public void command(String command,Leader leader){
        leader.doing(command);
    }

}

