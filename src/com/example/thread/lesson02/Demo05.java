package com.example.thread.lesson02;

public class Demo05 {
    public static void main(String[] args) {
        System.out.println("main thread start...");
        for (int i = 0; i < 3; i++) {
            final int id = i;
            Thread t = new Thread(() -> {
                System.out.println("children thread " + id + " run...");
                System.out.println("children thread " + id + " end.");
            });
            t.start();
        }
        System.out.println("main thread end.");
    }
}

/**
 * main thread start...
 * main thread end.
 * children thread 2 run...
 * children thread 0 run...
 * children thread 2 end.
 * children thread 1 run...
 * children thread 1 end.
 * children thread 0 end.
 */