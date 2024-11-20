package com.itheima.test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        /*定义方法实现随机产生一个5位的验证码
         * 验证码格式：
         * 长度为5
         * 前四位是大写字母或者小写字母
         * 最后一位是数字*/

        String result = getResult();
        System.out.println(result);
    }

    private static String getResult() {
        char[] chs1 = new char[52];
        String result = "";
        for (int i = 0; i < chs1.length; i++) {
            if (i <= 25) {
                chs1[i] = (char) (97 + i);
            } else {
                chs1[i] = (char) (65 + i - 26);
            }
        }
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs1.length);
            result += chs1[randomIndex];
        }
        int randomNum = r.nextInt(10);
        result += randomNum;
        return result;
    }
}
