package com.example.exception.demo03;

// 自定义的异常类
public class MyException extends Exception {
    // 传递数字 > 10 抛出异常

    private int detail;

    public MyException(int detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}
