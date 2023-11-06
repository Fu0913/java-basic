package com.briup.day10;

/**
 * @ClassName: Test
 * @Description: TODO
 * @Author: songjl
 * @Date: 2023/10/19 08:13
 * @Version: v1.0
 */
public class Test {

    static {
        // int x = 5;// x定义的局部变量，和静态成员变量x无关
        x = 5;
    }

    static int x = 0, y;

    public static void main(String[] args) {
        // x的初始值 0
        x--;// x = -1
        myMethod();
        System.out.println(x + y + ++x);
        // x + y + ++x
        // 1 + 0 + 2 = 3
    }

    public static void myMethod() {
        y = x++ + ++x;
        // x++ -1  x = 0
        // ++x 1   x = 1
        // y = -1 + 1 = 0
    }
}
