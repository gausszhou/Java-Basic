package com.example.scanner;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        System.out.print("请输入一个整数:");
        if(scanner.hasNextInt()) {
            i = scanner.nextInt();
            System.out.println("输入的整数为:" + i);
        } else {
            System.out.println("输入的不是整数!");
        }
        scanner.close();
    }
}
