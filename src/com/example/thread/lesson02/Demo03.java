package com.example.thread.lesson02;

public class Demo03 {
    // 用Java 8引入的 lambda 语法进一步简写
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("start new thread!");
        });
        t.start();
    }
}
