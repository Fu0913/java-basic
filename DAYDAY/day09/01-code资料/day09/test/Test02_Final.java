package com.briup.day09.test;

public class Test02_Final {
    public static void main(String[] args) {
        F f1 = new F();
        System.out.println(f1);
    }
}

class F {
    //第一种初始化方式：显式初始化
    //private final int num = 10;

    //第二种初始化方式：构造代码块初始化
//    private final int num;
//    {
//        num = 20;
//    }

    //第三种方式：构造方法进行初始化
    //注意：必须在所有的构造方法中 显式的 对 final成员变量进行初始化
    private final int num;
    public F() {
        num = 10;
    }
    public F(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "F{" +
                "num=" + num +
                '}';
    }
}
