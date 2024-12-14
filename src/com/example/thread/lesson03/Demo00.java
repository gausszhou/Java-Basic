package com.example.thread.lesson03;

public class Demo00 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread start...");
        Thread t = new Thread(() -> {
            System.out.println("children thread run...");
            System.out.println("children thread end.");
        });
        t.start();
        t.join();
        System.out.println("main thread end.");
    }
}
/**
 * main thread start...
 * children thread run...
 * children thread end.
 * main thread end.
 */