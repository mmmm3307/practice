package com.itheima.test2;

public class GirlFriend {
    //    属性
    private String name;
    private int age;
    private String gender;

//    针对每一个私有化的成员变量，都提供get和set方法
//    set方法：给成员变量赋值
//    get方法：对外提供成员变量的值

    public void setName(String name) {
//        局部变量表示测试类中调用方法传递过来的数据
//        等号的左边：表示成员位置的name
//        等号右边：局部变量
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 50) {
            this.age = age;
        } else {
            System.out.println("非法输入");
        }
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    //    行为
    public void sleep() {
        System.out.println("睡觉");
    }

    public void eat() {
        System.out.println("吃饭");
    }
}
