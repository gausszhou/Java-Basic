package com.example.oop.demo12;

public class Application {
    public static void main(String[] args) {

        Person p = new Student();
        Student s = new Student();
        p.run(); // Student.run()
        s.run(); // Student.run()
        ((Student)p).eat(); // Student.eat
        s.eat(); // Student.eat
    }
}

class Person {

    public void run() {
        System.out.println("Person.run");
    }

}

class Student extends Person {

    public void run() {
        System.out.println("Student.run");
    }

    public void eat() {
        System.out.println("Student.eat");
    }
}

