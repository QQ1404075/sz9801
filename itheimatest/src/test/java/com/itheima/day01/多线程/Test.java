package com.itheima.day01.多线程;

public class Test {
    public static void main(String[] args) {

        MyThred myThred = new MyThred("主线程");

        myThred.start();

        for (int k = 0; k < 100; k++) {
            System.out.println(Thread.currentThread().getName() + "k = " + k);
        }
    }
}
