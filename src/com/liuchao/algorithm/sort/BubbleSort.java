package com.liuchao.algorithm.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author liuchao
 * @date 2018/7/23 11:20
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {11, 10, 55, 78, 1000, 45};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
