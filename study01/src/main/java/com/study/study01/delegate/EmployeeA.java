package com.study.study01.delegate;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class EmployeeA implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工A，我现在开始干" + command + "工作");
    }
}
