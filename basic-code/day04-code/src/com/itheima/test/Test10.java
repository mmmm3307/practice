package com.itheima.test;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        /*需求：
         *   键盘录入星期数，输出工作日，休息日
         *   （1-5） 工作日   （6-7）  休息日*/

        Scanner sc = new Scanner(System.in);
        System.out.println("input week");
        int week = sc.nextInt();

        switch (week) {
            case 1, 2, 3, 4, 5 -> System.out.println("工作日");
//            case 2:
//            case 3:
//            case 4:
//            case 5:

//                break;
            case 6, 7 -> System.out.println("休息日");
//            case 7:

//                break;
            default -> System.out.println("invalid week");
//                break;

        }
    }
}
