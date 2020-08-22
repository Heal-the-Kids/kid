package com.study.study01.adapter.poweradapter;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class PowerAdapter implements DC5 {

   private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    public int outoupDC5V() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用PowerAdapter输入AC:" + adapterInput + "V,输出DC：" + adapterOutput + "V");
        return adapterOutput;
    }
}
