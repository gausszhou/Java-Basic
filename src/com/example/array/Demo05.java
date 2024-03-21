package com.example.array;

public class Demo05 {

    public static void main(String[] args) {
        forloop();
        forin();
        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = reverse(array);
        print(array2); // 5 4 3 2 1
    }

    static void forloop() {

        int[] array = {1, 2, 3, 4, 5};
        // 遍历
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        // 求和
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum); // 15
        // 查找最大值
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);// 5

    }
    static  void  forin(){
        int[] array = {1, 2, 3, 4, 5};
        for (int item: array){
            System.out.println(item);
        }

    }
    // 翻转数组
    static int[] reverse(int[] array){
        int[] result = new int[array.length];
        for (int i = 0,j = array.length - 1; i < array.length ; i++, j--) {
            result[i] = array[j];
        }
        return result;
    }
    static void print(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
