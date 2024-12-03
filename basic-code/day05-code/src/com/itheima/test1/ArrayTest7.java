package com.itheima.test1;

import java.util.Random;

public class ArrayTest7 {
    public static void main(String[] args) {
        /*需求：定义一个数组，存入1~5.要求打乱数组中所有数据的顺序*/

        int arr[] = {1, 2, 3, 4, 5};
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int r=rand.nextInt(arr.length);
            arr[i] = arr[r];
            arr[r] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
