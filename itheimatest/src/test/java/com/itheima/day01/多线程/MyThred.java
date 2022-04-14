package com.itheima.day01.多线程;

public class MyThred  extends Thread{

    public MyThred(){


    }

    public MyThred(String mes){
        super(mes);
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()  + "i = " +i);
        }

    }
}
