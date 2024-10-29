package com.itheima.test;

import java.util.Scanner;

public class LoopTest3 {
    public static void main(String[] args) {
        /*需求：键盘录入一个正整数x，并判断该整数是否是一个质数*/

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number");
        int x = sc.nextInt();

        boolean flag = true;

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                flag =false;
                break;
            }
        }
        System.out.println(flag);
    }
}
