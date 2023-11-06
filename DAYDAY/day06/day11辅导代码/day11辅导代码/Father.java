package com.briup.day11;

/**
 * @ClassName: Father
 * @Description: TODO
 * @Author: songjl
 * @Date: 2023/10/20 09:25
 * @Version: v1.0
 */
public class Father {
    static String name;
    int age = 50;
    static {
        System.out.println("Father类的静态代码块");
    }
    public Father() {
        getAge();
        System.out.println("Father类的构造器");
    }
    {
        System.out.println("Father类的构造代码块");
    }
    public void getAge() {
        System.out.println("年龄是："+age);
    }
    public static void main(String[] args) {
        new Child();
    }
}

class Child extends Father {
    static String name;
    int age = 20;

    public Child() {
        System.out.println("Child类的构造器");
    }

    static {
        System.out.println("Child类的静态代码块");
    }

    {
        System.out.println("Child类的构造代码块");
    }

    public void getAge() {
        System.out.println("年龄是："+age);
    }
}
