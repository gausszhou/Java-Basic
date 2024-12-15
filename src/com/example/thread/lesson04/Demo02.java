package com.example.thread.lesson04;

public class Demo02 {
    public static void main(String[] args) throws InterruptedException {
        HelloThread2 ht = new HelloThread2();
        ht.start();
        Thread.sleep(1);
        ht.running = false;
    }
}

class HelloThread2 extends Thread {
    public volatile boolean running = true;
    public void run() {
        System.out.println("children thread start...");
        int n = 0;
        while (running) {
            n ++;
            System.out.println(n + " hello!");
        }
        System.out.println("children thread end.");
    }
}

/**
 * children thread start...
 * 1 hello!
 * children thread end.
 */