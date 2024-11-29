package com.example.oop.demo04;

/**
 * 值的传递
 */
public class Application {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);  // 1
        change(a);
        System.out.println(a); // 1

        Student s = new Student();
        s.setName("Xiao Ming");
        s.setAge(18);
        s.setScore(100);
        System.out.println("s name is " + s.getName()); // s name is Xiao Ming
        System.out.println("s age is " + s.getAge()); // s age is 18
        System.out.println("s score is " + s.getScore()); // s score is 100
    }

    public static void change(int a) {
        System.out.println(a); // 1
        a = 10;
        System.out.println(a); // 10
    }
}
