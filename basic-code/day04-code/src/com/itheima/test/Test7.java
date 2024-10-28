package com.itheima.test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        /*需求：
         * 商场都会有VIP的会员制，根据不同的会员会有不同的折扣。
         * 假设商品的总价为1000
         * 键盘录入会员级别，并计算出实际支付的钱。
         * 会员1级：9折
         * 会员2级：8折
         * 会员3级：7折
         * 非会员：不打折
         * */
        int price =1000;
        Scanner sc = new Scanner(System.in);
        System.out.println("input VIP level");
        int level = sc.nextInt();

        if (level == 1) {
            System.out.println(price * 0.9);
        } else if (level == 2) {
            System.out.println(price * 0.8);
        } else if (level == 3) {
            System.out.println(price * 0.7);
        } else {
            System.out.println(price);
        }

    }
}
