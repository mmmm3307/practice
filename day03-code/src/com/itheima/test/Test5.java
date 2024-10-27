package com.itheima.test;

public class Test5 {
    public static void main(String[] args) {
        /*需求：一座寺庙住着三个和尚，已知他们的身高分别为150cm、210cm、165cm，
         * 请用程序实现获取这是三个和尚的最高身高。*/

//        1.定义三个变量记录身高
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;
//        2. 前两个比较,结果与第三个比较
        int temp = height1 > height2 ? height1 : height2;
        int max = temp > height3 ? temp : height3;

        System.out.println(max);


    }
}
