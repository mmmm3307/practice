package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class LoopTest4 {
    public static void main(String[] args) {
        /*需求：程序自动生成一个1-100之间的随机数字，使用程序猜出这个数字是多少*/
        int cnt = 0;
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        for (; ; ) {
            System.out.println("input a number");
            int guess = sc.nextInt();

            cnt++;
            if (cnt == 3) {
                System.out.println("you guessed correctly");
                break;
            }

            if (guess == number) {
                System.out.println("you guessed correctly");
                break;
            } else if (guess > number) {
                System.out.println("larger number");
            } else {
                System.out.println("smaller number");
            }
        }

    }

}
