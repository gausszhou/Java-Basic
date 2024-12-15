package com.example.basic.array;

/**
 * 数组的四个基本特点
 * 1. 其长度是固定的，数组一旦被创建，它的大小就是不可以改变的
 * 2. 其元素必须是相同类型，不允许出现混合类型。
 * 3. 数组中的元素可以是任何数据类型，包括基本类型和引用类型
 * 4. 数字变量属于引用类型，数组本身就是对象。
 */

public class Demo04 {
    public static void main(String[] args) {
        /**
         * 数组下标越界错误
         */
        int[] nums = new int[10];
        nums[11] = 0; // ArrayIndexOutOfBoundsException

    }
}

