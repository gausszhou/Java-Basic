package com.example.thread.lesson04;

/**
 * 如果线程需要执行一个长时间任务，就可能需要能中断线程。中断线程就是其他线程给该线程发一个信号，该线程收到信号后结束执行run()方法，使得自身线程能立刻结束运行。
 */
public class Demo00 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("start...");
        Thread t = new MyThread();
        t.start();
        Thread.sleep(1);
        t.interrupt();
        t.join();
        System.out.println("end.");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        int n = 0;
        while(!isInterrupted()) {
            n++;
            System.out.println( n + " hello...");
        }
    }
}

/**
 * start...
 * 1 hello...
 * end.
 */
