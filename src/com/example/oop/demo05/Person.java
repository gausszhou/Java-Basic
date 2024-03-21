package com.example.oop.demo05;

public class Person {

    public String name = "person";
    public int age;
    private int money  = 10_0000_0000;

    public Person() {
        System.out.println("Person");
    }

    public  void  say(String word){
        System.out.println(word);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

}
