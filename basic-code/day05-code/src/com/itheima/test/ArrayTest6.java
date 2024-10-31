package com.itheima.test;

public class ArrayTest6 {
    public static void main(String[] args) {
        /*需求：定义一个数组，存入1， 2， 3， 4， 5。交换收尾索引对应的元素
         * */

        int arr[] = {1, 2, 3, 4, 5};
//        int temp[] = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            temp[arr.length - i - 1] = arr[i];
//        }
//        for (int i = 0; i < temp.length; i++) {
//            System.out.println(temp[i]);
//        }
        int temp = 0;
//        for (int i = 0; i < arr.length/2; i++) {
//            temp=arr[i];
//            arr[i]=arr[arr.length-i-1];
//            arr[arr.length-i-1]=temp;
//        }

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
