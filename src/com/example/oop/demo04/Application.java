package com.example.oop.demo04;

/**
 * 值的传递
 */
public class Application {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);  // 1
        change(a);
        System.out.println(a); // 1
    }

    public static void change(int a) {
        System.out.println(a); // 1
        a = 10;
        System.out.println(a); // 10
    }
}
