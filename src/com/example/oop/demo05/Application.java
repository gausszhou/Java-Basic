package com.example.oop.demo05;

/**
 * 继承的本质是对某一批类的抽象，从而实现对现实世界更好的建模
 */

/**
 * 1. super 调用父类的构造方法
 * 2. super 必须出现在子类的方法或者构造方法中
 * 3. super 和 this 不能同时调用构造方法
 *
 */

/**
 * 方法的重写
 */
public class Application {
    public static void main(String[] args) {
        Student student = new Student();
        student.say("Hello"); // Hello
        System.out.println(student.getMoney()); // 1000000000
        System.out.println(student.getClass());;
        student.test("World");
    }
}
