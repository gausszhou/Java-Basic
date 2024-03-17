package com.example.scanner;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入:");
        if (scanner.hasNext()) {
            String str = scanner.next();
            System.out.println("输入的内容为:" + str);
        }
        scanner.close();
        /**
         * 请输入:Hello world
         * 输入的内容为:Hello
         */
    }

}
