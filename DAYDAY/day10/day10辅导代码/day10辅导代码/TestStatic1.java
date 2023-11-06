package com.briup.day10;

/**
 * @ClassName: TestStatic
 * @Description: TODO
 * @Author: songjl
 * @Date: 2023/10/19 08:08
 * @Version: v1.0
 */
public class TestStatic1 {

    public static String name = "TestStatic1";

    static {
        name = "TestStatic2";
    }

    public static void main(String[] args) {
        System.out.println(TestStatic1.name);// TestStatic2
    }

    /*
        加载 -> 链接 -> 初始化（clinit）

        链接 : 验证 -> 准备（静态成员变量赋值（默认值）） -> 解析

        准备： name -> null

        用final修饰的静态成员变量 ——>  准备（静态成员变量赋值（默认值））
     */
}