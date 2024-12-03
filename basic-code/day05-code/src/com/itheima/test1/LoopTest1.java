package com.itheima.test1;

public class LoopTest1 {
    public static void main(String[] args) {
        /*需求：打印出1-100满足逢7过规则的数据*/
        for (int i = 1; i < +100; i++) {
            if (i % 7 == 0 || i % 10 == 7 || i / 10 % 10 == 7) {
                System.out.println("pass");
                continue;
            }
            System.out.println(i);
        }
    }
}

