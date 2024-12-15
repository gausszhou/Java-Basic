package com.example.basic.loop;

public class Demo02 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        do {
            System.out.println(i);
            sum += i;
            i++;

        }  while (i <= 100);
        System.out.println(sum);
    }
}
