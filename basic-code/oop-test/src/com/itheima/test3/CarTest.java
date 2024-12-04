package com.itheima.test3;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
//        1.创建一个数组
        Car[] arr = new Car[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
//            创建汽车对象
            Car c = new Car();
//            录入
            System.out.println("请输入品牌");
            String brand = sc.next();
            c.setBrand(brand);
            System.out.println("价格");
            double price = sc.nextDouble();
            c.setPrice(price);
            System.out.println("颜色");
            String color = sc.next();
            c.setColor(color);

//           添加数组
            arr[i] = c;
        }
//            遍历
        double sumPrice = 0.0;
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            sumPrice += car.getPrice();
        }


    }
}
