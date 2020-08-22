package com.study.study01.proxy.staticproxy;


import com.study.study01.proxy.Person;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class Father implements Person {
    private Son person;

    public Father(Son person){
        this.person = person;
    }

    public void findLove(){
        System.out.println("父亲物色对象");
        this.person.findLove();
        System.out.println("双方父母同意，确立关系");
    }

    public void findJob(){

    }


}
