package com.example.array;

/**
 * 数组是相同类型数据的有序集合
 * 数组描述的是相同类型的若干个数据，按照一定的次序排列组合而成
 * 其中，每个数据称作一个数组元素，每个数组元素可以通过一个下标来访问他们
 */

public class Demo01 {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    static int[] createIntList(int length) {
        int[] nums = new int[length]; // 给出数组大小 int 数组默认填充0
        System.out.println(nums.length); // 10
        return nums;
    }

    public static final void test1() {
        System.out.println("test1======");
        int[] nums1 = createIntList(10);
        int[] nums2 = nums1;
        System.out.println(nums1[0]); // 0
        nums1[0] = 1;
        System.out.println(nums1[0]); // 1
        System.out.println(nums2[0]); // 1
    }

    public static final void test2() {
        System.out.println("test2======");
        int[] nums1 = createIntList(10);
        int[] nums2 = createIntList(10);
        System.out.println(nums1[0]); // 0
        nums1[0] = 1;
        System.out.println(nums1[0]); // 1
        System.out.println(nums2[0]); // 0
    }

    public static final void test3() {
        System.out.println("test3======");
        int[] nums = createIntList(3);
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println(sum); // 6
    }

}
