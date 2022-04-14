package com.itheima.day01.对象和类;

public class Test {
    public static void main(String[] args) {


        Person person = new Student();
        System.out.println(person.num);

        person.eat();
        person.meothd();




    }

    public static Person test(Person person){
        person.eat();
        return person;

    }
}
