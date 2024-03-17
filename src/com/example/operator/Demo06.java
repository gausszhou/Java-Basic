package com.example.operator;

public class Demo06 {
    public static void main(String[] args) {
        System.out.println(2 << 1); // 4
        System.out.println(2 >> 1); // 1
        System.out.println(2 >> 2); // 0
        System.out.println(2 >> 3); // 0 精度丢失
    }
}
