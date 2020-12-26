package com.example.fanxingdemo.thread;

/**
 * @Author: xuwei
 * @Date: 2020/12/17 10:08
 * @Description: Thread.sleep()
 * 在程序中允许一个线程进行暂时的休眠，直接使用 Thread.sleep() 即可实现休眠。
 */
public class ThreadSleepDemo {
    public static void main(String[] args) {
        SleepThread sleepThread = new SleepThread(); //实例化runnable子对象
        Thread thread = new Thread(sleepThread, "线程");
        thread.start();
    }
}

class SleepThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "运行，i = " + i);
        }
    }
}
