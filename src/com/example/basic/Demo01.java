package com.example.basic;

public class Demo01 {
    public static void main(String[] args) {
        // 所有的标识符都应该以 字母 $ _ 开始
        // 首字符之后可以是 字母 $ _ 数字
        // 注意标识符是大小写敏感的
        String hello = "Hello";
        String world = "World";
        String $hello = "Hello";
        String hello1 = "Hello";
        String hello_world = hello + world + "!";
        System.out.println(hello_world);
    }
}

