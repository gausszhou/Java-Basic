package com.example.basic;

public class Demo05 {
    public static void main(String[] args) {
        /**
         * 注意点
         * 1. 不能对布尔值进行转换
         * 2. 不能把对对象类型转换位不相干类型
         * 3. 高容量到低容量需要强制转换
         * 4. 转换的时候可能存在内存溢出或者丢失精度
         */

        // 强制转换  高到低
        int i = 128;
        byte b = (byte) i;
        System.out.println(b); // - 128
        float f = 61.8f;
        double d = 61.8;
        System.out.println((int) f); // 61
        System.out.println((int) d); // 61
        // 自动转换  低到高
        long l = (long) i;
        System.out.println(l); // 128
        char c = 'a';
        System.out.println(c + 1); // 98


    }
}
