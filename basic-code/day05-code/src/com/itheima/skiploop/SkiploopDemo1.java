package com.itheima.skiploop;

public class SkiploopDemo1 {
    public static void main(String[] args) {
//        1. 跳过某一次循环
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
//        结束本次循环，继续下次循环
                continue;
            }
            System.out.println(i);
        }
    }
}