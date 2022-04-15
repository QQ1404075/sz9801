package com.itheima.day02.demo1_多线程卖票;

import java.util.Map;

public class Test {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        Thread thread = new Thread(myRunnable,"窗口1" );
        thread.start();
        Thread thread2 = new Thread(myRunnable,"窗口2" );
        thread2.start();
        Thread thread3 = new Thread(myRunnable,"窗口3" );
        thread3.start();
        Thread thread4 = new Thread(myRunnable,"窗口4" );
        thread4.start();

    }
}
