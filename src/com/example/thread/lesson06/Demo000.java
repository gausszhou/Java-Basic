package com.example.thread.lesson06;

/**
 * 两个线程同时对一个int变量进行操作，一个加10000次，一个减10000次，最后结果应该是0，但是，每次运行，结果实际上都是不一样的。
 */
public class Demo000 {
    public static void main(String[] args) throws InterruptedException {
        IncThread inc = new IncThread();
        DecThread dec = new DecThread();
        inc.start();
        dec.start();
        inc.join();
        dec.join();
        System.out.println(Counter.count);
    }
}

class Counter {
    public static int count = 0;
}


class IncThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            Counter.count += 1;
        }
    }
}


class DecThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            Counter.count -= 1;
        }
    }
}