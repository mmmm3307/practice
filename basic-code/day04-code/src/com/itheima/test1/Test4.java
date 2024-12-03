package com.itheima.test1;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        /*需求：
         * 假设，用户在超市实际购买，商品总价为600
         * 键盘录入一个整数表示用户实际支付的钱。
         * 如果付款大于等于600，表示付款成功。否则付款失败。*/

        Scanner sc = new Scanner(System.in);
        System.out.println("please input the money you have paid:");
        int money = sc.nextInt();

        if (money >= 600) {
            System.out.println("success!");
        } else {
            System.out.println("failed");
        }

    }
}
