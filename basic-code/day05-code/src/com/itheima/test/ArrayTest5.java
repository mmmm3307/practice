package com.itheima.test;

import java.util.Random;

public class ArrayTest5 {
    public static void main(String[] args) {
        /*需求生成10个1~100之间的随机数存入数组：
         * 1. 求出所有数据的和
         * 2. 求出所有数据的平均数
         * 3. 统计有多少个数据比平均值小*/

        int arr[] = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(100) + 1;
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("和：" + sum);
        System.out.println("平均数：" + sum / arr.length);

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < sum / arr.length) {
                cnt++;
            }
        }

        System.out.println("有" + cnt + "个数据小于平均数");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
