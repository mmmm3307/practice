package com.itheima.test;

public class ArrayTest2 {
    public static void main(String[] args) {

//        定义一个数组，存储1，2， 3， 4， 5， 6， 7， 8， 9 ，10
//        遍历数组得到每一个元素，统计数组里面一共有多少个能被3整除的数字
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
