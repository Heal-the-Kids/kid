package com.study.study01.adapter.poweradapter;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class PowerAdapterTest {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter(new AC220());
        dc5.outoupDC5V();
    }
}
