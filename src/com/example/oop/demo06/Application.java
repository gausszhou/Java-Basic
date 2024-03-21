package com.example.oop.demo06;

public class Application {

    public static void main(String[] args) {
        Person xiaoHong  = new Person("小红");
        System.out.println(xiaoHong.name);
        System.out.println(xiaoHong.age); // 0

        Person xiaoZhou = new Person("小周", 18);
        System.out.println(xiaoZhou.name);
        System.out.println(xiaoZhou.age); // 18
    }
}
