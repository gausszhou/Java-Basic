package com.example.thread.lesson02;

public class Demo04 {
    public static void main(String[] args) {
        System.out.println("main thread start...");
        Thread t = new Thread(() -> {
            System.out.println("thread run...");
            System.out.println("thread end.");
        });
        t.start();
        System.out.println("main thread end.");
    }
}

/**
 * main thread start...
 * main thread end.
 * thread run...
 * thread end.
 */
