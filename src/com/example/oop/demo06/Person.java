package com.example.oop.demo06;

public class Person {

    String name;
    int age;

    public Person() {
    }

    Person(String name){
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
