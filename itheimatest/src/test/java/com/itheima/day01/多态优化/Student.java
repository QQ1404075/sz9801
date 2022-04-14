package com.itheima.day01.多态优化;

public class Student extends Person{
    public int num = 10;
    public String className;

    public void eat(){
        System.out.println("学生会吃饭");
    }
    public void study(){
        System.out.println("学生在睡觉");
    }
    public static void meothd(){
        System.out.println("父类的静态方法");
    }
}
