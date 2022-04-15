package com.itheima.day02.demo2_悲观锁;



public class Test {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

         new Thread(myRunnable,"窗口1" ).start();
         new Thread(myRunnable,"窗口2" ).start();
        new Thread(myRunnable,"窗口3" ).start();
         new Thread(myRunnable,"窗口4" ).start();


    }
}
