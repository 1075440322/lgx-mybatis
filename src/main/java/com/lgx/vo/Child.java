package com.lgx.vo;

/**
 * Created by Administrator on 2019/10/9 0009.
 */
public class Child extends People {

    People father;
    public Child(String name){
        System.out.println(3);
        this.name = name;
        father = new People(name+"F");
    }
    public Child(){
        System.out.println(4);
    }


    public static void main (String args[]){
        new Child("mike");
    }
}
