package com.example.loop;

public class Question01 {
    /**
     * 计算 0 到 100 以内，奇数和偶数之和
     *
     * @param args
     */
    public static void main(String[] args) {
        int sum_odd = 0;
        int sum_even = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum_even += i;
            } else {
                sum_odd += i;
            }
        }
        System.out.println("奇数之和" + sum_odd);
        System.out.println("偶数之和" + sum_even);
    }
}
