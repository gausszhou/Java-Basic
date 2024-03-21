package com.example.exception.demo03;

/**
 * 自定义异常
 * 1. 创建自定义异常类
 * 2. 在方法中通过 throw 抛出异常对象
 * 3. 通过 try-catch 捕获
 */

public class Application {

    public static void main(String[] args) {
        try {
            new Test().test(11);
        } catch (MyException e) {
            e.printStackTrace();
        }
        try {
            new Test().test(9);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
