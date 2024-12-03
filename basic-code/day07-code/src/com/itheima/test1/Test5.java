package com.itheima.test1;

import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        /*6名评委打分，分数范围[0-100]之间的整数。
        * 求去掉一个最高分，去掉一个最低分后的平均分*/
        Random r=new Random();
        int[] arrScore=new int[6];
        for (int i = 0; i < arrScore.length; i++) {
            arrScore[i]=r.nextInt(101);
        }
        int max=arrScore[1];
        int min=arrScore[5];
        for (int i = 0; i < arrScore.length; i++) {
            if (arrScore[i]>max) {
                max=arrScore[i];
            } else if (arrScore[i]<min) {
                min=arrScore[i];
            }
        }
//        System.out.println(max);
//        System.out.println(min);
        int sum=0;
        for (int i = 0; i < arrScore.length; i++) {
            sum+=arrScore[i];
        }
        System.out.println((sum-max-min)/(arrScore.length-2));
    }
}
