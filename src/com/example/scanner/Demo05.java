package com.example.scanner;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double avg = 0;
        int count = 0;
        System.out.println("请输入数字,输入非数字计算平均值");
        while(scanner.hasNextDouble()){
            double d = scanner.nextDouble();
            sum += d;
            count +=1;
            System.out.println("你输入了第" + count + "个数字" + d);
        }
        avg = sum / count;

        System.out.println(count +"个数字总和为"+ sum);
        System.out.println(count +"个数字平均值为"+ avg);
        scanner.close();
    }
}
