package com.itheima.switchdemo;

/*default的位置和省略
* 1.位置，不一定写在最下面
* 2.省略，default可以省略
* */

public class SwitchDemo2 {
    public static void main(String[] args) {
        int num = 1;
        switch (num) {
            case 1:
                System.out.println("num is 1");
                break;
            case 10:
                System.out.println("num is 10");
                break;
            default:
                System.out.println("不是以上所有数");
                break;
            case 20:
                System.out.println("num is 20");
                break;
        }
    }
}
