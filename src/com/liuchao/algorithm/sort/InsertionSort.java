package com.liuchao.algorithm.sort;

import java.util.Arrays;

/**
 * 插入排序
 *
 * @author liuchao
 * @date 2018/7/16 9:52
 */
public class InsertionSort {

    public static void main(String[] args) {
        // int[] a = {11, 10, 55, 78, 100, 1000, 45, 56, 79, 90, 345, 111};
        int[] a = {11, 10, 55, 78, 1000, 45};
        sort(a, a.length);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a, int len) {
        // 第一趟: 10, 11, 55, 78, 1000, 45
        // 第二趟: 10, 11, 55, 78, 1000, 45
        // 第三趟: 10, 11, 55, 78, 1000, 45
        // 第四趟: 10, 11, 55, 78, 1000, 45
        for (int i = 1; i < len; i++) {
            for (int j = i; j > 0 && (a[j - 1] > a[j]); j--) {
                int temp = a[j];
                a[j] = a[j -1];
                a[j -1] = temp;
            }
        }
    }

    public static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j;
            for (j = i - 1; j >= 0 && less(a[j], temp); j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = temp;
        }
    }


    public static boolean less(int a, int b) {
        return a > b;
    }
}
