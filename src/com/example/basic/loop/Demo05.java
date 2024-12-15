package com.example.basic.loop;

/**
 * 打印三角形
 *          *
 *         * *
 *        * * *
 *       * * * *
 *      * * * * *
 *     * * * * * *
 *    * * * * * * *
 *   * * * * * * * *
 *  * * * * * * * * *
 */
public class Demo05 {
    public static void main(String[] args) {
        int row_count = 10;
        for (int i = 0; i < row_count; i++) {
            for (int j = row_count; j > i; j-- ) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
