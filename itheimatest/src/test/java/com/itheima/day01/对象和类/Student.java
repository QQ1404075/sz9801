package com.itheima.day01.对象和类;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student extends Person{
    public int num = 10;
    public String className;
    @Override
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
