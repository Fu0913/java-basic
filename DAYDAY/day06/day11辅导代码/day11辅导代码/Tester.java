package com.briup.day11;

/**
 * @ClassName: Tester
 * @Description: TODO
 * @Author: songjl
 * @Date: 2023/10/20 09:19
 * @Version: v1.0
 */
public class Tester {
    public static void main(String[] args) {
        Integer var1 = new Integer(1);
        Integer var2 = var1;
        doSomething(var2);
        System.out.print(var1.intValue());
        System.out.print(var1 == var2);
        // 1true
    }

    public static void doSomething(Integer integer) {
        integer = new Integer(2);
    }
}