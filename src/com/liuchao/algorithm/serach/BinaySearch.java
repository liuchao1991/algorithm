package com.liuchao.algorithm.serach;

import java.util.Arrays;

/**
 * 二分查找
 *
 * @author liuchao
 * @date 2018/7/13 11:32
 */
public class BinaySearch {

    public static void main(String[] args) {
        int[] a = new int[]{1, 4, 9, 2, 7, 5};
        Arrays.sort(a);
        System.out.println(rank(5, a));
    }

    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return a[mid];
        }
        return -1;
    }
}
