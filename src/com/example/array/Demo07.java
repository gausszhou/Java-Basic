package com.example.array;

import java.util.Arrays;
import java.util.Comparator;

public class Demo07 {
    public static void main(String[] args) {
        int[] a = {1, 23, 41, 59, 15, 43, 61, 15, 68};
        System.out.println(Arrays.toString(a)); // [1, 23, 41, 59, 15, 43, 61, 15, 68]
        System.out.println(arrayToString(a));// [1, 23, 41, 59, 15, 43, 61, 15, 68]
        // 排序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a)); // [1, 15, 15, 23, 41, 43, 59, 61, 68]
        // 填充
        Arrays.fill(a, 0); 
        System.out.println(Arrays.toString(a)); // [0, 0, 0, 0, 0, 0, 0, 0, 0]
    }

    /**
     * 自己实现一下 Arrays.toString
     *
     * @param array
     * @return
     */
    static String arrayToString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            int item = array[i];
            if (i == array.length - 1) {
                str += item;
            } else {
                str += item + ", ";

            }

        }

        str += "]";
        return str;
    }
}
