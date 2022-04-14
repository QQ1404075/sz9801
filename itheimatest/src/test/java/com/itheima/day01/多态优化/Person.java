package com.itheima.day01.多态优化;

public class Person {
    public String name;
    public String age;
    public int num = 20;
    public void eat(){
        System.out.println("人类会吃饭");
    }
    public static void meothd(){
        System.out.println("父类的静态方法");
    }
}
