package com.example.loop;

public class Demo01 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i<= 100) {
            System.out.println(i);
            sum +=i;
            i++;
        }
        System.out.println(sum);
    }
}
