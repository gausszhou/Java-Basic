package com.example.exception.demo02;

public class Test01 {


    public void errorTry() {
        int a = 1;
        int b = 0;
        // 捕获多个异常，范围要从小到大
        try {
            System.out.println("try 监控区域");
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("catch 捕获异常 ArithmeticException");
        } catch (Exception e) {
            System.out.println("catch 捕获异常 Exception");
        } catch (Error e) {
            System.out.println("catch 捕获异常 Error");
        } catch (Throwable e) {
            System.out.println("catch 捕获异常 Throwable");
        } finally {
            System.out.println("finally");
        }

    }

    public void  stackOverflowError(){
        stackOverflowError();
    }

}
