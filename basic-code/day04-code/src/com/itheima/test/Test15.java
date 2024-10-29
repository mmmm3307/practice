package com.itheima.test;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        /*需求：键盘录入两个数字，表示一个范围。
         * 统计这个范围中。
         * 既能被3整除，又能被5整除的数字有多少个*/

//        键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("input smaller number");
        int start = sc.nextInt();
        System.out.println("input larger number");
        int end = sc.nextInt();

        int sum = 0;

        for (int i = start; i < end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum++;
            }
        }

        System.out.println(sum);
    }
}
