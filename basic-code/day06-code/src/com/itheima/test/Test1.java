package com.itheima.test;

public class Test1 {
    public static void main(String[] args) {
//        定义方法，比较两个长方形的面积
        double area1 = getArea(5.3, 1.7);
        double area2 = getArea(2.4, 2.7);
        if (area1 > area2) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }
    }

    public static double getArea(double len, double width) {
        return len * width;
    }
}
