package com.itheima.arraydemo;

public class ArrayDemo1 {
    public static void main(String[] args) {
//        格式
//        静态初始化：
//        完整格式：数据类型 [] 数组名 = new 数据类型{元素1， 元素2，...};
//        简化格式：数据类型 [] 数组名 = {元素1， 元素2，...};
//

//        定义数组存储5个学生的年龄
        int[] arr1 = {1, 2, 3, 4, 5};

//        定义数组存储5个学生的姓名
        String[] arr2={"1","2","3","4","5"};

//        定义数组存储5个学生的身高
        double[] arr3={1.0,2.0,3.0,4.0};
        System.out.println(arr3);//[D@10f87f48   地址值
//        [: 表示当前是一个数组
//        D：表示当前数组里的元素都是double类型的
//        @：间隔符号，没有实际含义
//        10f87f48：数组的地址值
    }
}
