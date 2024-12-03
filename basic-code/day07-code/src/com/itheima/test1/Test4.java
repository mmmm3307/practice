package com.itheima.test1;

public class Test4 {
    public static void main(String[] args) {
        /*复制数组*/
        int[]arr={1,2,3,4,5};
        int[]newArr=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
