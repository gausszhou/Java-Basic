package com.example.basic.operator;

public class Demo05 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b  = false;
        System.out.println(a && b); // false
        System.out.println(a || b); // true
        System.out.println(!a); // false
        System.out.println(!b); // true
        System.out.println(!(a && b)); // true
    }
}
