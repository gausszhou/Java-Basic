package com.example.thread.lesson02;

public class Demo06 {
    // 必须调用Thread实例的start()方法才能启动新线程
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.run(); // 直接调用run()方法，相当于调用了一个普通的Java方法，当前线程并没有任何改变，也不会启动新线程。
    }
}
