package com.example.oop.demo07;

public class Student {
    String name;
    int age;

    public static void main(String[] args) {

    }

    public static void sayHi() {
        System.out.println("Hi");
    }

    public void sayGood() {
        System.out.println("Good");
    }

    public void study() {
        System.out.println(this.name + "在学习");
    }
}
