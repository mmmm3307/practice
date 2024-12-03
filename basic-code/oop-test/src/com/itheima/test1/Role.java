package com.itheima.test1;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    //    定义方法用于攻击
//    方法的调用者攻击参数
    public void attack(Role role) {
//        计算造成的伤害
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
//        被攻击者的血量
        int remainBlood = role.getBlood() - hurt;
//        剩余血量验证
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        role.setBlood(remainBlood);

        System.out.println(this.getName() + "打了" +
                role.getName() + "一下，造成" + hurt +
                "点伤害，"+role.getName()+"还剩下" + role.getBlood()
                + "点血量");
    }
}
