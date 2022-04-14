package com.itheima.day01.多态表现形式;

public abstract class Person {

    public String name = "父类的名字";

    public  abstract void eat() ;
    public void sleep(){
        System.out.println("父类在睡觉");
    }
}
