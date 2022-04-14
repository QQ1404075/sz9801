package com.itheima.day01.对象和类;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


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
