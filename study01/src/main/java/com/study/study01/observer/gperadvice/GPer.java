package com.study.study01.observer.gperadvice;

import java.util.Observable;

/**
 * JDK提供的一种观察者的实现方式，被观察者
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class GPer extends Observable{

    private String name = "GPer生态圈";
    private static GPer gper = null;
    private GPer(){}

    public static GPer getInstance(){
        if(null == gper){
            gper = new GPer();
        }
        return gper;
    }

    public String getName() {
        return name;
    }

    public void publishQuestion(Question question){
        System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。");
        setChanged();
        notifyObservers(question);
    }
}
