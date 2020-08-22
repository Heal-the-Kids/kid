package com.study.study01.stratege.pay.payport;


import com.study.study01.stratege.pay.MsgResult;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public abstract class Payment {

    //支付类型
    public abstract String getName();

    //查询余额
    protected abstract double queryBalance(String uid);

    //扣款支付
    public MsgResult pay(String uid, double amount) {
        if(queryBalance(uid) < amount){
            return new MsgResult(500,"支付失败","余额不足");
        }
        return new MsgResult(200,"支付成功","支付金额：" + amount);
    }


}
