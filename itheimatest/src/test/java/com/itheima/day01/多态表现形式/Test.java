package com.itheima.day01.多态表现形式;

import java.util.HashSet;

public class Test {


    public static void main(String[] args) {

        Student student = new Student();
        mothed(student);
        Person person = new Student();
        System.out.println(     person.name);
        HashSet<String> stu = new HashSet<>();
        stu.add("");

    }

    public static Person mothed(Person person){
        person.sleep();
        return person;
    }


}
