package com.itheima.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /*需求：
         * 键盘录入一个整数，表示身上的钱。
         * 如果大于等于100块，就吃网红餐厅。
         * 否则，沙县
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the money you have:");
        int money = sc.nextInt();

        if (money >= 100) {
            System.out.println("网红餐厅");
        } else {
            System.out.println("沙县");
        }


    }
}
