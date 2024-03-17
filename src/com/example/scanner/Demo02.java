package com.example.scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入:");
        if (scanner.hasNextLine()){
            String str = scanner.nextLine();
            System.out.println("输出的内容为:" + str);
        }
        scanner.close();
        /**
         * 请输入:Hello world
         * 输出的内容为:Hello world
         */
    }
}
