package com.example.thread.lesson06;

public class Demo021 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread start...");
        CounterWithDeadLock c = new CounterWithDeadLock();
        Thread t1 = new Thread(() -> {
            System.out.println("children thread start...");
            c.add(1);
            System.out.println("children thread end.");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("children thread start...");
            c.minus(1);
            System.out.println("children thread end.");
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.value1);
        System.out.println(c.value2);
        System.out.println("main thread end.");
    }
}

class CounterWithDeadLock {
    public static final Object lockA = new Object();
    public static final Object lockB = new Object();
    public int value1 = 0;
    public int value2 = 0;

    static void sleep1s() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void add(int n) {
        synchronized (lockA) {
            this.value1 += n;
            sleep1s();
            synchronized (lockB) {
                this.value2 += n;
            }
        }
    }

    public void minus(int n) {
        synchronized (lockB) {
            this.value2 -= n;
            sleep1s();
            synchronized (lockA) {
                this.value1 -= n;
            }
        }
    }
}