package com.example.oop.demo08;


public class Application {
    public static void main(String[] args) {
        Student xiaoMing = new Student();
        // xiaoMing.name = ""; // 'name' has private access in 'com.example.oop2.Student'
        xiaoMing.setName("小明");
        System.out.println(xiaoMing.getName()); // 小明

        xiaoMing.setAge(125);
        System.out.println(xiaoMing.getAge()); // 3
        xiaoMing.setAge(18);
        System.out.println(xiaoMing.getAge()); // 18
    }
}
