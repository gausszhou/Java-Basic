package com.example.exception.demo03;

public class Test {

    // 可能会存在异常的方法
    public void test(int a) throws MyException {
        System.out.println("接收到参数" + a);
        if (a > 10) {
            throw new MyException(a);
        }
        System.out.println("ok");
    }
}
