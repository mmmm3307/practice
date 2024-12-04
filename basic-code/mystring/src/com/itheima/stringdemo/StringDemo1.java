package com.itheima.stringdemo;

public class StringDemo1 {
    public static void main(String[] args) {
//        1.直接赋值获取一个字符串对象
        String s1 = "abc";
        System.out.println(s1);

//        2.使用new的方式来获取
//        空参构造
        String s2 = new String();
        System.out.println(s2);

//        传递一个字符串
        String s3 = new String("abc");
        System.out.println(s3);

//        传递一个字符数组
//        需求：修改字符串的内容
        char[] chs={'a','b','c','d'};
        String s4=new String(chs);
        System.out.println(s4);

//        传递一个字节数组，ASCII码
//        应用场景：对字节信息进行转换
        byte[] ch1={97,98,99,100};
        String s5=new String(ch1);
        System.out.println(s5);
    }
}
