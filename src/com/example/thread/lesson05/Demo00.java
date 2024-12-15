package com.example.thread.lesson05;

/**
 * 守护线程是指为其他线程服务的线程。在JVM中，所有非守护线程都执行完毕后，无论有没有守护线程，虚拟机都会自动退出。
 */
public class Demo00 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread start....");
        TimerThread tt = new TimerThread();
        tt.setDaemon(true);
        tt.start();
        System.out.println("main thread end");
    }
}

/**
 * 必须作为守护线程使用
 */
class  TimerThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("daemon thread run");
            try {
                Thread.sleep(1000);
            } catch ( InterruptedException e) {
                break;
            }
        }
    }
}

/**
 * main thread start....
 * main thread end
 * daemon thread run
 */