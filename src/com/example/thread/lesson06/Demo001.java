package com.example.thread.lesson06;

public class Demo001 {

    public static void main(String[] args) throws InterruptedException {
        IncThreadSync inc = new IncThreadSync();
        DecThreadSync dec = new DecThreadSync();
        inc.start();
        dec.start();
        inc.join();
        dec.join();
        System.out.println(CounterWithLock.count);
    }
}

class CounterWithLock {
    public static final Object lock = new Object();
    public static int count = 0;
}

class IncThreadSync extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (CounterWithLock.lock) { // 获取锁
                CounterWithLock.count += 1;
            } // 释放锁
        }
    }
}


class DecThreadSync extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (CounterWithLock.lock) {
                CounterWithLock.count -= 1;
            }

        }
    }
}
