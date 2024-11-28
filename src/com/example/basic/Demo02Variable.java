package com.example.basic;

public class Demo02Variable {
    public static void main(String[] args) {
        // Java 是强类型语言
        // 要求变量的使用要严格符合规定，所有变量都必须先定义后才能使用
        /**
         * String a;
         * System.out.println(a);
         */
        basic();
        number();
        reference();
    }

    public static void basic() {
        // 整数
        byte num1 = 10;
        short num2 = 20;
        int num3 = 30; // int 最常用
        long num4 = 30L; // long 数字后面要加 L
        // 小数
        float num5 = 2.71828f; // 数字后面要加 f
        double num6 = 3.14159265358979323846;
        // 字符
        char g = 'G'; // 字符要使用单引号
        // 布尔值
        boolean flag = true;
        flag = false;
    }

    public static void number() {
        // ====================
        System.out.println("====================进制");
        // ====================
        int i2 = 0b10; // 二进制的 10 表示十进制的 2
        int i10 = 10;
        int i8 = 010; // 八进制的 10 表示十进制的 8
        int i16 = 0x10; // 八进制的 10 表示十进制的 16
        System.out.println(i2);
        System.out.println(i10);
        System.out.println(i8);
        System.out.println(i16);
        // ====================
        System.out.println("====================浮点数的问题");
        // ====================
        // 浮点数的问题
        // 精度
        float f = 0.3f;
        double d1 = 0.1 + 0.2;
        double d2 = 0.3;
        System.out.println(f == d1); // false
        System.out.println(d1 == d2); // false
        // 溢出
        float f1 = 12345678910f;
        float f2 = f1 + 1;
        System.out.println(f1 == f2); // true
        // ====================
        System.out.println("====================强制转换");
        // ====================
        // 字符 转 Int 输出：字符对应的 Unicode 码
        // 字符的本质还是数字
        char c1 = '1';
        char c2 = 'a';
        char c3 = '中';
        char c4 = '\u0061'; // 16 进制的 61 表示 97 最终输入 a
        System.out.println(c1); // 1
        System.out.println((int)c1); // 49
        System.out.println((int)c2); // 97
        System.out.println((int)c3); // 20013
        System.out.println(c4); // a
    }

    public static void reference() {
        Integer num0 = 0;
        String Gauss = "Gauss"; // 字符串要使用双引号
        // ====================
        System.out.println("====================字符串常量池");
        // ====================
        // 字符串常量池
        // 为了提高性能并减少内存的开销，JVM在实例化字符串常量时进行了一系列的优化操作
        // 1.在JVM层面为字符串提供字符串常量池，可以理解为是一个缓存区
        // 2.创建字符串常量时，JVM会检查字符串常量池中是否存在这个字符串
        // 3.若字符串常量池中存在该字符串，则直接返回引用实例；若不存在，先实例化该字符串，并且，将该字符串放入字符串常量池中
        String sa = "abc";
        String sb = "abc";
        System.out.println(sa == sb); // true
        String sc = new String("abc");
        String sd = new String("abc");
        System.out.println(sc == sd); // false
    }
}
