package com.example.oop.method;

public class Demo02 {
    /**
     * 方法重载
     * 参数个数/顺序/类型不同
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(max(1,2)); // max2 // 2
        System.out.println(max(1,2,3)); // max3 // 3
    }
    public static final int max(int num1 ,int num2){
        System.out.println("max2");
        return Math.max(num1, num2);
    }
    public static final int max(int num1 ,int num2, int num3){
        System.out.println("max3");
        int num = Math.max(num1, num2);
        num = Math.max(num, num3);
        return num;
    }
}
