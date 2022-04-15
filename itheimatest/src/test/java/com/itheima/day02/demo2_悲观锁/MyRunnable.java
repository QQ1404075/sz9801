package com.itheima.day02.demo2_悲观锁;

public class MyRunnable implements Runnable{
    int tickets = 1000;
    @Override
    public void run() {
        // 窗口卖票

        while (true){
            synchronized (this){
                if (tickets< 1){
                    break;
                }

                System.out.println(Thread.currentThread().getName()+"正在售第 "+ tickets+"张票");

                tickets --;
            }
        }

    }
}
