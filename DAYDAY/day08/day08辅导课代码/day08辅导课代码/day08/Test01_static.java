package com.briup.day08;

/**
 * @ClassName: Test01_static
 * @Description: TODO
 * @Author: songjl
 * @Date: 2023/10/17 08:56
 * @Version: v1.0
 */
public class Test01_static {

    private static int num = 10;

    static {
        // System.out.println("为静态成员变量赋值");
    }

    {
        System.out.println("构造块");
    }

    public Test01_static() {
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        /*
            JVM 类的生命周期
            加载（loading） -> 链接（linking）-> 初始化(clinit) -> 使用 -> 卸载
            链接（linking）：验证、准备（静态成员变量赋初始值）、解析（将符号引用替换成直接引用）
         */
        // Test01_static test01Static = new Test01_static();


        // System.out.println(A.num);// 10
        System.out.println(B.num);
    }
}

class A {
    public static int num = 10;
}

class B extends A{
    static {
        num = 20;
    }

    public B() {

    }
}