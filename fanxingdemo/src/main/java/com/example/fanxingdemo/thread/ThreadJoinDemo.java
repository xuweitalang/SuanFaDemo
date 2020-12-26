package com.example.fanxingdemo.thread;

/**
 * @Author: xuwei
 * @Date: 2020/12/17 10:00
 * @Description: 在线程操作中，可以使用 join() 方法让一个线程强制运行，线程强制运行期间，其他线程无法运行，必须等待此线程完成之后才可以继续执行。
 */
public class ThreadJoinDemo {
    public static void main(String[] args) {
        MyThread runnable = new MyThread(); //实例化runnable子类对象
        Thread t = new Thread(runnable, "线程");
        t.start();
        for (int i = 0; i < 50; i++) {
            if (i > 10) {
                try {
                    t.join(); //线程强制运行
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Main线程运行 --> " + i);
        }
    }
}

class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + "运行，i=" + i); //获取当前线程的名字
        }
    }
}

