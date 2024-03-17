package com.example.basic;

public class Demo06 {
    public static void main(String[] args) {
        // JDK7 之后数字之间可以用下划线分割
        int money = 1_0000_0000; // 一个小目标
        System.out.println(money); // 100000000
        int years = 500;
        int total = money * years; // 计算的时候溢出了
        System.out.println(total); // -1539607552
        long total_1 = money * ((long) years);
        System.out.println(total_1); // 50000000000
    }
}
