package com.example.oop.demo13;

public class Application {
    public static void main(String[] args) {

        System.out.println("======");
        Object s = new Student();
        System.out.println(s instanceof Student); // true
        System.out.println(s instanceof Person); // true
        System.out.println(s instanceof Teacher); // false
        System.out.println(s instanceof Object); // true
        System.out.println(s instanceof String); // false

        System.out.println("======");
        Person s1 = new Student();
        System.out.println(s1 instanceof Student); // true
        System.out.println(s1 instanceof Person); // true
        System.out.println(s1 instanceof Teacher); // false
        System.out.println(s1 instanceof Object); // true
        // System.out.println(s1 instanceof String); // 编译报错

        System.out.println("======");
        Student s2 = new Student();
        System.out.println(s2 instanceof Student); // true
        System.out.println(s2 instanceof Person); // true
        // System.out.println(s2 instanceof Teacher); // 编译报错
        System.out.println(s2 instanceof Object); // true
        // System.out.println(s1 instanceof String); // 编译报错
    }
}
