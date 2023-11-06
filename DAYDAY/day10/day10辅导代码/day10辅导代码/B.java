package com.briup.day10;

/**
 * @ClassName: B
 * @Description: TODO
 * @Author: songjl
 * @Date: 2023/10/19 08:04
 * @Version: v1.0
 */
public class B {
    //  链接 ——> 准备 t1 = null   t2 = null
    //  初始化  -> 静态成员变量的赋值 static代码块 按照在类中定义顺序
    public static B t1 = new B(); // 构造块

    public static B t2 = new B(); // 构造块

    static {
        System.out.println("静态块"); // 静态块
    }

    {
        System.out.println("构造块");
    }

    public static void main(String[] args) {
        B b = new B(); // 构造块
    }
}
