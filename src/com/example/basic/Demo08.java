package com.example.basic;

public class Demo08 {
    static double salary = 2500;
    String name;
    int age;

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = add(a, b);
        System.out.println(c); // 3

//        this.age = 18;

        Demo01 demo01 = new Demo01();
        String[] s = {"a", "b"};
        demo01.main(s); // HelloWorld!
        System.out.println(demo01); // Demo01@1b6d3586

        Demo08 demo08 = new Demo08();
        demo08.age = 18;
        System.out.println(Demo08.salary); // 2500.0
        System.out.println(demo08.name); // null
        System.out.println(demo08.age); // 18
    }

    public static final int add(int a, int b) {
        return a + b;
    }
}
