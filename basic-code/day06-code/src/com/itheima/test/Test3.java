package com.itheima.test;

public class Test3 {
    public static void main(String[] args) {
        /*需求：设计一个方法求数组的最大值，并将最大值返回*/
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(getArrayMax(arr));
    }

    public static int getArrayMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
