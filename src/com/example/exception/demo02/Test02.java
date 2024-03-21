package com.example.exception.demo02;

public class Test02 {

    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        // ctrl + alt + t
        try {
            System.out.println(a /b );
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}
