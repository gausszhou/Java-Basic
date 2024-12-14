package com.example.thread.lesson02;

public class Demo00 {
    // 要创建一个新线程非常容易，我们需要实例化一个Thread实例，然后调用它的start()方法
    public static void main(String[] args) {
        Thread t = new Thread();
        t.start();
    }
}
