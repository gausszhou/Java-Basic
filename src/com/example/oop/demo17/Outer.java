package com.example.oop.demo17;

public class Outer {
    private int id = 10;

    public void out() {
        System.out.println("这是外部类的方法");
    }

    class Inner {
        public void in() {
            System.out.println("这是内部类的方法");
        }

        /**
         * 获取外部类的私有属性
         */
        public int getId() {
            return id;
        }
    }

    static class StaticInner {
        public void in() {
            System.out.println("这是静态内部类的方法");
        }
    }

    public void method() {

        class MethodInner {
            public void in() {
                System.out.println("这是局部内部类的方法");
            }
        }

    }
}
