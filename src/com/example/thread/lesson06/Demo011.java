package com.example.thread.lesson06;

public class Demo011 {
    public static void main(String[] args) {
        var c1 = new CounterSync1();
        var c2 = new CounterSync1();

        // 对c1进行操作的线程:
        new Thread(() -> {
            c1.add(1);
        }).start();
        new Thread(() -> {
            c1.minus(2);
        }).start();

        // 对c2进行操作的线程:
        new Thread(() -> {
            c2.add(3);
        }).start();
        new Thread(() -> {
            c2.minus(4);
        }).start();

        System.out.println(c1.get()); // -1
        System.out.println(c2.get()); // -1
    }

}

class CounterSync1 {
    private int count = 0;

    public synchronized void add(int n) {
        count += n;
    }

    public synchronized void minus(int n) {
        count -= n;
    }

    public int get() {
        return count;
    }
}
