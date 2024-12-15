package com.example.oop.method;

public class Demo01 {
    public static void main(String[] args) {

        System.out.println(max(1, 2)); // 2
        System.out.println(add(1, 2)); // 3
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        }
        return num2;
    }
}
