package com.itheima.test1;

import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        /*数字加密：先得到每位数，然后每位数加5，在对10取余，最后将所有数字反转*/
//        1.把整数的每一位数字放进数组
//        int[] arr = getRandomArr(4);
//          1.1计算数组长度
        int number = 1983;
        int temp = number;
        int cnt = 0;
        while (temp != 0) {
            temp = temp / 10;
            cnt++;
        }
        int[] arr = new int[cnt];
        int index = arr.length - 1;
        while (number != 0) {
            int ge = number % 10;
            number = number / 10;
            arr[index] = ge;
            index--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//        2.对数组加密
        arr = arrEncrypt(arr);
//        拼接
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num * 10 + arr[i];
        }
        System.out.println(num);
    }

    public static int[] arrEncrypt(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
            arr[i] %= 10;
        }
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    public static int[] getRandomArr(int lenth) {
        int[] arr = new int[lenth];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
        }
        return arr;
    }
}
