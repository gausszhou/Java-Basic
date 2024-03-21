package com.example.exception.demo01;

/**
 * 检查性异常：无法预见的
 * 运行时异常：可预见的
 * 错误：错误不是异常，而是脱离程序员控制的问题
 */

/**
 * 异常体系结构
 * Java 把异常当作对象来处理，并定义一个基类 java.lang.Throwable 作为所有异常的超类
 * 异常分为两大类， 错误 Error 和 异常  Exception
 * Error VirtualMachineError AWTError
 * Exception IOException RuntimeException
 */
public class Application {

    public static void main(String[] args) {
        new StackOverflowError().a();
    }

}
