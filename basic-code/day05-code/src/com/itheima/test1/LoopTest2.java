package com.itheima.test1;

import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        /*需求：键盘录入一个大于等于2的整数，计算并返回其平方根
         * 结果只保留整数部分，小数部分被舍去*/

        Scanner sc = new Scanner(System.in);
        System.out.println("input a number");
        int x = sc.nextInt();

        for (int i = 1; i < x; i++) {
            if (i * i == x) {
                System.out.println(i);
                break;
            } else if (i * i > x) {
                System.out.println(i - 1);
                break;
            }
        }
    }
}
