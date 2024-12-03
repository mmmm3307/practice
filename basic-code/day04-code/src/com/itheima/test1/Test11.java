package com.itheima.test1;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        /*需求：
         *   当我们拨打某些服务电话时，一般都会有按键选择。
         *   假设现在我们拨打了一个机票预订电话
         * 电话中语音提示：
         * 1. 机票查询
         * 2. 机票预订
         * 3. 机票改签
         * 4. 退出服务
         * 其他按键也是退出服务。请使用switch模拟该业务逻辑*/

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();

        switch (num) {
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票预订");
            case 3 -> System.out.println("机票改签");
            default -> System.out.println("退出服务");
        }
    }
}
