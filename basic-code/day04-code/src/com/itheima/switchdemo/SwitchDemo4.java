package com.itheima.switchdemo;

/*
 * Switch的新特性
 *   JDK12 */

public class SwitchDemo4 {
    public static void main(String[] args) {
        /*
         * 需求：
         * 1， 2， 3       一，二， 三*/

        /*int num = 1;
        switch (num) {
            case 1:
                System.out.println("一");
                break;
            case 2:
                System.out.println("二");
                break;
            case 3:
                System.out.println("三");
                break;
            default:
                System.out.println("没有这种选项");
                break;*/

        int num = 1;
        switch (num) {
            case 1 -> //{
                System.out.println("一");
            //}
            case 2 -> //{
                System.out.println("二");
            //}
            case 3 -> //{
                System.out.println("三");
            //}
            default -> //{
                System.out.println("没有这种选项");
            //}

        }
    }
}
