package com.itheima.test1;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        /*需求：
         * 根据不同的分数送不同的礼物。
         * 95~100 自行车
         * 90~94 游乐场
         * 80~89 变形金刚
         * 小于80 打一顿*/

        Scanner sc = new Scanner(System.in);
        System.out.println("input score");
        int score = sc.nextInt();

//        对异常数据进行校验
        if (score > 0 && score <= 100) {
            if (score >= 95 && score <= 100) {
                System.out.println("自行车");
            } else if (score >= 90 && score < 95) {
                System.out.println("游乐场");
            } else if (score >= 80 && score < 90) {
                System.out.println("变形金刚");
            } else {
                System.out.println("打一顿");
            }
        } else {
            System.out.println("invalid score");
        }


    }
}
