package com.itheima.test1;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        /*需求：动物园里有两只老虎，体重分别通过键盘录入获得，
        请用程序实现判断两只老虎的体重是否相同。*/

//        分析：
//        1.键盘录入两只老虎的体重
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重");
        int weight1 = sc.nextInt();
        System.out.println("请输入第二只老虎的体重");
        int weight2 = sc.nextInt();

//        2.比较
        System.out.println(weight1 == weight2? "相同" : "不同");
    }
}
