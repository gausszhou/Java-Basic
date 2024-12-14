package com.example.thread.lesson02;

public class Demo01 {
    // 方法一：从Thread派生一个自定义类，然后覆写run()方法
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start(); // 启动新线程
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("start new thread!");
    }
}
