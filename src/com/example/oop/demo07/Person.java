package com.example.oop.demo07;

public class Person {
    String name;
    int age;
    // 无参构造
    public Person() {
        this.name = "default";
    }
    // 有参构造
    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
