package com.example.thread.lesson06;

public class Demo020 {
    public static void main(String[] args) throws InterruptedException {
        Counter2 c = new Counter2();
        new Thread(() -> {
            c.add(1);
        }).start();
        new Thread(() -> {
            c.minus(2);
        }).start();
        new Thread(() -> {
            c.add(3);
        }).start();
        Thread.sleep(1);
        System.out.println(c.getCount()); // 2
    }
}

class Counter2 {

    private int count = 0;

    public synchronized void add(int n) {
        count += n;
    }

    public synchronized void minus(int n) {
        count -= n;
    }

    public int getCount() {
        return count;
    }


}