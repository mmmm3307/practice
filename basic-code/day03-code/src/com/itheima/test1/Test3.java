package com.itheima.test1;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /*数字6是一个真正伟大的数字，键盘录入两个整数。
        如果其中一个为 6， 最终结果输出true。
        如果他们的和为 6的倍数，最终结果输出true。
        其他结果都是false*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num1 = sc.nextInt();
        System.out.println("请输入一个整数");
        int num2 = sc.nextInt();

        boolean result = num1 == 6 || num2 == 6 || (num1 + num2) % 6 == 0;

        System.out.println(result);
    }
}
