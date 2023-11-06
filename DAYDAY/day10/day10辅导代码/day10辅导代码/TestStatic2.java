package com.briup.day10;

/**
 * @ClassName: TestStatic2
 * @Description: TODO
 * @Author: songjl
 * @Date: 2023/10/19 08:11
 * @Version: v1.0
 */
public class TestStatic2 {
    static {
        name = "TestStatic2";
    }

    public static String name = "TestStatic1";

    public static void main(String[] args) {
        System.out.println(TestStatic2.name);// TestStatic1
    }
}