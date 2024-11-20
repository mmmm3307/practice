package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {
        /*判断101~200之间有多少个素数，并输出所有素数*/
        int cnt = 0;
        for (int i = 101; i < 201; i++) {
            if (getPrimeNum(i)) {
                cnt++;

            }
        }
        System.out.println(cnt);
    }

    private static boolean getPrimeNum(int num) {
        boolean flag = true;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
