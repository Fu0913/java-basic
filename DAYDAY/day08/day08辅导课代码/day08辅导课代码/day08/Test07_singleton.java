package com.briup.day08;

/**
 * @ClassName: Test07_singleton
 * @Description: 单例设计模式（基础版）
 * @Author: songjl
 * @Date: 2023/10/17 09:21
 * @Version: v1.0
 */
public class Test07_singleton {
    public static void main(String[] args) {
        Singleton2 singleton1 = Singleton2.getInstance();
        System.out.println(singleton1);

        Singleton2 singleton2 = Singleton2.getInstance();
        System.out.println(singleton2);
    }
}

// 单例设计模式：构造方法私有化
// 饿汉式
class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {

    }

    // 仅提供一个对外访问的方法
    public static Singleton getInstance() {
        return singleton;
    }
}

// 懒汉式
class Singleton2 {
    private static Singleton2 singleton;

    private Singleton2() {

    }

    // 仅提供一个对外访问的方法
    public static Singleton2 getInstance() {
        if (singleton == null) {
            singleton = new Singleton2();
        }
        return singleton;
    }
}
