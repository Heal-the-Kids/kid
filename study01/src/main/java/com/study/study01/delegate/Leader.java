package com.study.study01.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class Leader implements IEmployee {

    private Map<String,IEmployee> targets = new HashMap<String,IEmployee>();

    public Leader() {
        targets.put("加密",new EmployeeA());
        targets.put("登录",new EmployeeB());
    }

    //项目经理自己不干活
    public void doing(String command){
        targets.get(command).doing(command);
    }

}
