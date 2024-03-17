package com.example.loop;

public class Question03 {
    /**
     * 打印九九乘法表
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = i; j <= 9; j++) {
                int k = i * j;
                System.out.print(i + "x" + j + "=" + k + "\t");
            }
            System.out.println();
        }
    }
}
