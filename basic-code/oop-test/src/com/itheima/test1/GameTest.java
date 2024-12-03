package com.itheima.test1;

public class GameTest {
    public static void main(String[] args) {
//        创建第一个角色
        Role r1 = new Role("乔峰", 100);
//        创建第二个角色
        Role r2 = new Role("鸠摩智", 100);

//        开始格斗，回合制
        while (true) {
            r1.attack(r2);
            if (r2.getBlood() == 0) {
                System.out.println(r1.getName() + "获胜");
                break;
            }
            r2.attack(r1);
            if (r1.getBlood() == 0) {
                System.out.println(r2.getName() + "获胜");
                break;
            }
        }
    }
}
