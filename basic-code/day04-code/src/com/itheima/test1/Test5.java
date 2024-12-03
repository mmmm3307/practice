package com.itheima.test1;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        /*需求：假设某影院售卖了100张票，票的序号为1~100.
         * 其中奇数票号坐左侧，偶数票号坐右侧。
         * 键盘录入一个整数表示电影票的票号。
         * 根据不同情况，给出不同的提示：
         * 如果票号为奇数，打印左边、
         * 如果票号为偶数，打印右边*/

        Scanner sc = new Scanner(System.in);
        System.out.println("input your number");
        int num = sc.nextInt();

        if (0 < num && num <= 100) {

            if (num % 2 == 0) {
                System.out.println("right");
            } else {
                System.out.println("left");
            }
        }
    }
}
