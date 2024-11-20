package com.itheima.test;

public class Test7 {
    public static void main(String[] args) {
        /*解密*/
//        1.反转数组
        int[] arr = {8, 3, 4, 6};
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]){
                case 0,1,2,3,4->arr[i]+=10;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]-=5;
        }
//        拼接
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num * 10 + arr[i];
        }
        System.out.println(num);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
