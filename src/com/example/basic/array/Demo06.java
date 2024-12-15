package com.example.basic.array;

public class Demo06 {
    public static void main(String[] args) {
        int[][] cube = {
                {1, 1},
                {1, 2},
                {2, 1},
                {2, 2}
        };
        System.out.println(cube.length); // 4
        System.out.println(cube[0].length); // 2
        System.out.println(cube[0][0] + "," + cube[0][1]); // 1,1
        System.out.println(cube[3][0] + "," + cube[3][1]); // 2,2
        // 遍历二维数组
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j< cube[i].length; j++) {
                System.out.print(cube[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
