package com.liuchao.algorithm.example;

/**
 * 最大公约数
 *
 * @author liuchao
 * @date 2018/7/23 11:25
 */
public class GCD {

    public static void main(String[] args) {
        int i = gcd(121, 50);
        System.out.println(i);
    }

    public static int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }
}
