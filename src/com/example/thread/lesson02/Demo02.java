package com.example.thread.lesson02;

public class Demo02 {
    // 方法二：创建Thread实例时，传入一个Runnable实例
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.printf("start new thread!");
    }
}
