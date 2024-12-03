package com.itheima.test1;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*    需求：
    您和您的约会对象在餐厅里面正在约会。
    键盘录入两个整数，表示你和你约会对象衣服的时髦程度。（手动录入0~10之间的整数，不能录入其他）
    如果你的世贸成都大于你对象的时髦程度，相亲就成功，输出true。
    否则输出false。*/

//    1.键盘录入两个整数表示衣服的时髦度
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入自己的衣服时髦度");
        int myFashion = sc.nextInt();
        System.out.println("请输入相亲对象衣服的时髦度");
        int girlFashion = sc.nextInt();

//    2. 衣服时髦度进行对比
        boolean  result = myFashion > girlFashion;

//        3.打印结果
        System.out.println(result);
    }
}



