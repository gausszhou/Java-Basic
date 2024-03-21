package com.example.oop.demo17;

/**
 * 内部类
 * 在一个类的内部定义一个类
 * 1. 成员内部类
 * 2.
 */

public class Application {

    public static void main(String[] args) {
        Outer o = new Outer();
        o.out();

        // 实例化一个内部类
        Outer.Inner i =  o.new Inner();
        // 调用内部类的方法
        i.in();
        System.out.println(i.getId()); // 10

        // 实例化一个静态内部类
        Outer.StaticInner si = new Outer.StaticInner();
        si.in();

    }
}
