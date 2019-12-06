package com.lgx.vo;

/**
 * Created by Administrator on 2019/10/9 0009.
 */
public class People {


    String name;
    public People(){
        System.out.println(1);
    }
    public People(String name){
        System.out.println(2);
        this.name = name;
    }
}
