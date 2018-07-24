package com.liuchao.algorithm.sort;

import java.util.Arrays;

/**
 * 选择排序
 *
 * @author liuchao
 * @date 2018/7/16 9:47
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] a = {11, 10, 55, 78, 1000, 45};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j]) min = j;
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }
}
