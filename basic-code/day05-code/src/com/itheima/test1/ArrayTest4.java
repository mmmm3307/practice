package com.itheima.test1;

public class ArrayTest4 {
    public static void main(String[] args) {
        /*求数组最大值*/
        int arr[]={1,2,3,4,5};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i]) {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}