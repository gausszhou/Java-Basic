package com.example.oop.demo03;

/**
 * 方法的重载
 */
public class Hello {
    public static void main(String[] args) {
        hello();
        hello("gausszhou");
        hello("alice", 17);
        hello("bob", 18);
    }
    public static void hello() {
        System.out.println("Hello, world!");
    }

    public static void hello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void hello(String name, int age) {
        if (age < 18) {
            System.out.println("Hi, " + name + "!");
        } else {
            System.out.println("Hello, " + name + "!");
        }
    }
}
