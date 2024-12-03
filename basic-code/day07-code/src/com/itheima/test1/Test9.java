package com.itheima.test1;

import java.util.Random;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        /*双色球抽奖*/
//        生成中奖号码
        int[] arr = creatNum();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


//        用户输入号码
        int[] userInput = userInput();
//        Scanner sc = new Scanner();

//        匹配红球相等个数

//        判断获奖
        getPrice(arr, userInput);

    }

    public static void getPrice(int[] arr, int[] userArr) {
        int cnt = count(arr, userArr);

        if (arr[arr.length - 1] == userArr[userArr.length - 1]) {
            switch (cnt) {
                case 0, 1 -> System.out.println("获得6等奖！");
                case 2, 3 -> System.out.println("获得5等奖！");
                case 4 -> System.out.println("获得4等奖！");
                case 5 -> System.out.println("获得3等奖！");
                case 6 -> System.out.println("获得1等奖！");
            }
        } else {
            switch (cnt) {

                case 4 -> System.out.println("获得5等奖！");
                case 5 -> System.out.println("获得4等奖！");
                case 6 -> System.out.println("获得2等奖！");
                default -> System.out.println("没有获奖");

            }
        }

    }

    public static int count(int[] arr, int[] userArr) {
        int cnt = 0;
        for (int i = 0; i < userArr.length - 1; i++) {
            if (contains(arr, userArr[i], arr.length - 1)) {
                cnt++;
            }
        }
        return cnt;
    }


    public static int[] userInput() {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; ) {
            if (i == arr.length - 1) {
                System.out.println("请输入蓝球号：");
                int blueNumber = sc.nextInt();
                if (blueNumber >= 1 && blueNumber <= 16) {
                    arr[arr.length - 1] = blueNumber;
                    i++;
                } else {
                    System.out.println("请重新输入");
                }
            } else {
                System.out.printf("请输入红球 " + (i + 1) + "号：");
                int redNumber = sc.nextInt();
                if (redNumber >= 1 && !contains(arr, redNumber, arr.length) && redNumber <= 33) {
                    arr[i] = redNumber;
                    i++;
                } else {
                    System.out.println("请重新输入");
                }
            }
        }

        return arr;
    }

    public static int[] creatNum() {
        Random r = new Random();
        int[] arr = new int[7];
        for (int i = 0; i < arr.length - 1; ) {
            int redNumber = r.nextInt(33) + 1;
            if (!contains(arr, redNumber, arr.length)) {
                arr[i] = redNumber;
                i++;
            }
        }
        arr[arr.length - 1] = r.nextInt(16) + 1;
        return arr;
    }

    //    判断数字在数组中是否存在
    public static boolean contains(int[] arr, int num, int length) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
