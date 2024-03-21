package com.example.oop.demo14;

public class Application {

    public static void main(String[] args) {
        System.out.println("=== static 关键词详解 ===");
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println("=== 静态 ===");
        s1.age = 18;
        System.out.println(s1.age); // 18
        System.out.println(s2.age); // 18
        System.out.println(Student.age); // 18

        System.out.println("=== 实例 ===");
        s1.score = 100;
        System.out.println(s1.score); // 100
        System.out.println(s2.score); // 0
        // System.out.println(Student.score); // 报错
    }
}
