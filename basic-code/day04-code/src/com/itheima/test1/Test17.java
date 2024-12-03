package com.itheima.test1;

import java.util.Scanner;

public class Test17 {
    public static void main(String[] args) {
        /*需求：
         * 给你一个整数 x
         * 如果 x 是一个回文整数，打印true，否则返回false。
         * 解释：回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。*/


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");

        int x = sc.nextInt();
        int temp = x;
        int num = 0;
        while (x != 0) {
            int ge = x % 10;
            x = x / 10;
            num = num * 10 + ge;
        }

//        System.out.println(num);
        System.out.println(num == temp);
    }
}
