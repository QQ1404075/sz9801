package com.itheima.day01.多态表现形式;

public class Student extends Person implements IA{
    public String name = "子类的名字";
    @Override
    public void eat() {
        System.out.println("学生类在吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("学生类在睡觉");
    }
}
