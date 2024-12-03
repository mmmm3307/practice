package com.itheima.test1;

public class Test2 {
    public static void main(String[] args) {
        /*汽车无人驾驶会涉及到大量的判断
         * 当汽车形式的时候遇到了红绿灯，就会进行判断
         * 如果红灯亮，就停止
         * 如果黄灯亮，就减速
         * 如果绿灯亮，就行驶*/

//        1.定义三个变量表示灯的状态
//        true 亮    false 灭
        boolean isLightGreen = true;
        boolean isLightRed = false;
        boolean isLightYellow = false;

//        2. 判断
        if (isLightGreen) {
            System.out.println("go");
        }

        if (isLightYellow) {
            System.out.println("slow");
        }

        if (isLightRed) {
            System.out.println("stop");
        }
    }
}
