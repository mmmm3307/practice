package com.itheima.test;

public class Test16 {
    public static void main(String[] args) {
        /*需求：
         * 世界最高山峰是珠穆朗玛峰（8844.43米=8844430毫米），假设我有一张足够大的纸，它的厚度是0.1毫米。
         * 请问，折叠多少次，可以折成珠穆朗玛峰的高度？*/

        double paper = 0.1;
        double height=8844430;
        int cnt = 0;
        while (paper <= height) {
            paper *= 2;
            cnt++;
        }
        System.out.println(cnt);
    }
}
