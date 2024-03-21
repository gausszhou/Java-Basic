package com.example.oop.demo11;

public class B extends A {

    public static void test() {
        System.out.println("B.test");
    }

    // 重写实例方法
    @Override
    public void testI() {
        System.out.println("B.testI");
    }

}
