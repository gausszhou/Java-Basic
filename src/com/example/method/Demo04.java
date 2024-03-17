package com.example.method;

public class Demo04 {
    public static void main(String[] args) {
        Demo04 demo04 = new Demo04();
        demo04.test(1, 2, 3, 4);
    }

    public final void test(int... args) {
        for (int arg : args) {
            System.out.println(arg);
        }

    }
}
