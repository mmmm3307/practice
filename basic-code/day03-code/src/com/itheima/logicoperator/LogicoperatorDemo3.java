package com.itheima.logicoperator;

public class LogicoperatorDemo3 {
    public static void main(String[] args) {
//        1. &&
//        运行结果和单个&一样，两边都为真，结果才是真
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);



//        2. || 短路或
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(false || false);

//        3. 短路运算符具有短路效果
//        当左边的表达式能确定最终的结果，那么右边就不会参与运行了
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);//b是否参加运算

        boolean result1 = ++a < 5 & ++b < 5;
        System.out.println(result1);
        System.out.println(a);
        System.out.println(b);//b是否参加运算

    }
}
