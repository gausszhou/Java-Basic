package com.example.exception.demo01;

public class StackOverflowError {
    public void a() {
        b();
    }

    public void b() {
        a();
    }

}
