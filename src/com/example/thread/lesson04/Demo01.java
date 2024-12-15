package com.example.thread.lesson04;

public class Demo01 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread start...");
        Thread t = new MyThread1();
        t.start();
        Thread.sleep(1000);
        t.interrupt();
        t.join();
        System.out.println("main thread end.");
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        Thread hello = new HelloThread1();
        hello.start(); // 启动hello线程
        try {
            hello.join(); // 等待hello线程结束
        } catch (InterruptedException e) {
            System.out.println("my thread interrupted!");
        }
        hello.interrupt();
    }
}

class HelloThread1 extends Thread {
    public void run() {
        int n = 0;
        while (!isInterrupted()) {
            n++;
            System.out.println(n + " hello thread!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
