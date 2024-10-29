package com.itheima.arraydemo;

public class ArrayDemo2 {
    public static void main(String[] args) {
        /*
         * 利用索引对数组中的元素进行访问
         * 1. 获取数组里面的元素
         * 格式：数组名[索引]
         * 2. 把数据存储到数组当中
         * 格式：数组名[索引] = 具体数据/变量
         * */

        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(arr1[1]);

        arr1[0] = 5;
        System.out.println(arr1[0]);
    }
}
