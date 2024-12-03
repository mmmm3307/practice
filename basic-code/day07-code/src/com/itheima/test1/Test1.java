package com.itheima.test1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*需求：机票价格按照淡季、旺季、头等舱和经济舱收费，输入机票原价、月份和头等舱或经济舱。
         * 按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到次年4月）头等舱7折，经济舱6.5折。*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        double price = sc.nextInt();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入头等舱或经济舱：");
        String seat = sc.next();
//        ctrl+alt+m 自动抽取方法
        switch (month) {
            case 5, 6, 7, 8, 9, 10: {
                price = getPrice(seat, price, 0.9, 0.85);
                break;
            }
            case 1, 2, 3, 4, 11, 12: {
                price = getPrice(seat, price, 0.7, 0.65);
                break;
            }
            default: {
                System.out.println("invalid input");
            }
        }
        System.out.println(price);

    }

    public static double getPrice(String seat, double price, double x, double x1) {
        switch (seat) {
            case "头等舱": {
                price = price * x;
                break;
            }
            case "经济舱": {
                price = price * x1;
                break;
            }
            default: {
                System.out.println("invalid input");
            }
        }
        return price;
    }

}
