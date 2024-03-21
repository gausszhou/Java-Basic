package com.example.oop.demo05;

public class Student extends Person {
    String name = "student";
    int id;

    public Student() {
        // super(); // 隐藏代码 默认调用父类的无参构造器
        System.out.println("Student");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public  void  test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
