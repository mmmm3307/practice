package com.itheima.test;

import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) {
        /*需求：给定两个整数，被除数和除数（都是正数，且不超过int范围）。
        * 将两数相除，要求不使用乘法、除法和 % 运算符。
        * 得到商和余数*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数");
        int a = sc.nextInt();
        System.out.println("请输入除数");
        int b = sc.nextInt();

        int cnt=0;
        while (a>=b) {
            a=a-b;
            cnt++;
        }
        System.out.println("余数"+a+"商"+cnt);

    }
}
