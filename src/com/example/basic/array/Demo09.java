package com.example.basic.array;

import java.util.Arrays;

/**
 * 稀疏矩阵
 */
public class Demo09 {
    public static void main(String[] args) {
        // 1. 创建一个 11 x 11 的二维数组
        int[][] array = new int[11][11];
        array[1][2] = 1;
        array[2][3] = 1;
        // 输出原始的数组
        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
        /**
         * [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
         * [0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0]
         * [0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]
         * [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
         * [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
         * [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
         * [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
         * [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
         * [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
         * [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
         * [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
         */
        // 转为稀疏数组
        int count = 0;
        for (int[] ints : array) {
            for (int num : ints) {
                if (num > 0) {
                    count++;
                }
            }
        }
        System.out.println("有效值的个数" + count);
        int[][] array1 = new int[count + 1][3];
        // 第一行存储矩阵的大小和有效值个数
        array1[0][0] = 11;
        array1[0][1] = 11;
        array1[0][2] = count;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > 0) {
                    index++;
                    array1[index] = new int[]{i, j, array[i][j]};
                }
            }
        }
        // 打印
        for (int[] ints : array1) {
            System.out.println(Arrays.toString(ints));
        }
        /**
         * [11, 11, 2]
         * [1, 2, 1]
         * [2, 3, 1]
         */
        int[][] array2 = restore(array1);
        // 打印
        for (int[] ints : array2) {
            System.out.println(Arrays.toString(ints));
        }
        /**
         * [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
         * [0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0]
         * [0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0]
         * [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
         * [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
         * [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
         * [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
         * [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
         * [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
         * [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
         * [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
         */
    }

    public static int[][] restore(int[][] array) {
        int rows = array[0][0];
        int cols = array[0][1];
        int[][] result = new int[rows][cols];
        for (int i = 1; i< array.length; i++){
            result[array[i][0]][array[i][1]] = array[i][2];
        }
        return result;
    }
}
