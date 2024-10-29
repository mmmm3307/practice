package com.itheima.test;

public class Test13 {
    public static void main(String[] args) {
        /*需求：求1-5之间的和*/

//        如果把变量定义在循环的里面，那么当前变量只能在本次循环中有效
//        当本次循环结束之后，变量就会从内存中消失。
//        第二次循环开始的时候，又会重新定义一个新的变量。

        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
