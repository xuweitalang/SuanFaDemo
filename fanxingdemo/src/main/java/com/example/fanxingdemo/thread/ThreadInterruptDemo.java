package com.example.fanxingdemo.thread;

/**
 * @Author: xuwei
 * @Date: 2020/12/17 10:15
 * @Description: interrupt()
 * 当一个线程运行时，另外一个线程可以直接通过interrupt()方法中断其运行状态。
 * 线程的thread.interrupt()方法是中断线程，将会设置该线程的中断状态位，即设置为true，
 * 中断的结果线程是死亡、还是等待新的任务或是继续运行至下一步，就取决于这个程序本身。
 * 线程会不时地检测这个中断标示位，以判断线程是否应该被中断（中断标示值是否为true）。它并不像stop方法那样会中断一个正在运行的线程。
 * <p>
 * 具体来说，当对一个线程，调用 interrupt() 时，
 * ① 如果线程处于被阻塞状态（例如处于sleep, wait, join 等状态），那么线程将立即退出被阻塞状态，并抛出一个InterruptedException异常。仅此而已。
 * ② 如果线程处于正常活动状态，那么会将该线程的中断标志设置为 true，仅此而已。被设置中断标志的线程将继续正常运行，不受影响。
 */
public class ThreadInterruptDemo {

    /*
    运行结果：

    1、进入run方法
    3、线程被中断
     */
    public static void main(String[] args) {
        InterruptThread interruptThread = new InterruptThread();
        Thread thread = new Thread(interruptThread, "线程");
        thread.start();
        try {
            Thread.sleep(2000);
            thread.interrupt(); //中断线程执行
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("终止休眠");
        }
    }
}

class InterruptThread implements Runnable {

    @Override
    public void run() {
        System.out.println("1、进入run方法");
        try {
            Thread.sleep(5000);
            System.out.println("2、已经完成了休眠");
        } catch (InterruptedException e) {
//            e.printStackTrace();
            System.out.println("3、线程被中断");
        }
    }
}

