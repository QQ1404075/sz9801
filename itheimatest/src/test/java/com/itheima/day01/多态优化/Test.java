package com.itheima.day01.多态优化;

public class Test {

    public static void main(String[] args) {

        Person person = new Student();

        Student student = (Student) person;
        student.study();
    }
}
