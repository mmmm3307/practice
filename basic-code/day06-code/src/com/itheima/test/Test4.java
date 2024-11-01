package com.itheima.test;

public class Test4 {
    public static void main(String[] args) {
        /*需求：定义一个方法判断数组中的某一个数是否存在，返回结果*/

        int[] arr = {1, 5, 8, 12, 56, 89, 34, 67};
        System.out.println(getExist(arr, 89));
    }

    public static boolean getExist(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }

        return false;
    }
}
//return break关键字的区别
//return：和循环没有什么关系，跟方法有关，表示1.结束方法    2. 返回结果
//
//break：跟方法没有什么关系，结束循环或者Switch的