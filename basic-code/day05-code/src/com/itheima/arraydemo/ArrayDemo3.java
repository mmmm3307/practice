package com.itheima.arraydemo;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //    1. 定义数组
        int[] arr = {1, 2, 3, 4, 5};
//    2. 获取数组里面所有元素
//        开始条件：0
//        结束条件：数组的长度-1
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
// 关于数组的一个长度属性：length
//数组名.length

//自动的快速生成数组的遍历方式
//idea提供的
//数组名.fori