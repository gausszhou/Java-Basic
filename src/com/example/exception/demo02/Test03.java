package com.example.exception.demo02;

public class Test03 {

    public static void main(String[] args) {
        try {
            division(1, 0);
        } catch (Exception e) {
            e.printStackTrace(); // java.lang.ArithmeticException: b 不能为 0
        }
    }

    public static double division(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("b 不能为 0");
        }
        return a / b;
    }
}
