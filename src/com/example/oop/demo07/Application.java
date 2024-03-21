package com.example.oop.demo07;

public class Application {
    public static void main(String[] args) {

        /**
         * 1. 类与对象
         *  类是一个抽象的模板，对象是一个具体的实例
         * 2. 方法
         *  定义、调用
         * 3. 对应的引用
         *  引用类型 基本类型
         *  对象是通过引用来操作的  占 -> 堆
         * 4. 属性 字段 Field
         * 5. 对象的创建和使用
         *   - 必须使用 new 关键字创造对象 Person xiaoMing =  new Person()
         *   - 对象的属性
         *   - 对象的方法
         * 6. 类
         *  静态的属性
         *  动态的方法
         *
         */

        Student xiaoMing = new Student();
        xiaoMing.age = 3;
        xiaoMing.name = "小明";
        xiaoMing.study(); // 小明在学习
    }
}
