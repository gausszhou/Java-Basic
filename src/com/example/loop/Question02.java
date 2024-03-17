package com.example.loop;

public class Question02 {
    /**
     * 计算 1 到 1000 之内，能被 5 整除的数，每行打印三个
     *
     * @param args
     */
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            if (i % 5 == 0) {
                System.out.print(i + "\t");
            }
            if (i % (5 * 3) == 0) {
                System.out.println("");
            }
        }
    }
}
