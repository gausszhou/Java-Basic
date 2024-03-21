package com.example.oop.demo14;

public class Student {

    public static int age;
    public int score;

    static {
        System.out.println("静态代码块"); // 1 只执行一次
    }

    {
        System.out.println("匿名代码块"); // 2
    }

    public Student() {
        System.out.println("构造方法"); //3
    }

    public void run() {

    }

    public void go() {

    }

}
