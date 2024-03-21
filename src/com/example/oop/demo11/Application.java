package com.example.oop.demo11;

/**
 * 方法的重写
 * 1. 需要有继承关系，子类重写父类的方法
 * 2. 方法名，参数列表必须相同
 * 3. 修饰符：范围只能扩大不能缩小  public > protected > default > private
 * 4. 异常：范围只能缩小不能扩大 Exception > ClassNotFoundExpection
 *
 */

public class Application {
    public static void main(String[] args) {
        // 方法的调用只和左边有关
        B b = new B();
        b.test(); // B.test
        // 父类的引用指向了子类
        A bA = new B();
        bA.test(); // A.test 静态方法

        b.testI(); // B.test
        bA.testI(); // B.test

        b.testA();
        bA.testA();
    }
}
