package com.briup.day10;

/**
 * @ClassName: C
 * @Description: TODO
 * @Author: songjl
 * @Date: 2023/10/19 08:15
 * @Version: v1.0
 */
public class TestA extends A {
    TestA() {
        super("B");
        System.out.print("B");
    }

    public static void main(String[] args) {
        new TestA();
    }
}

class C {

    C() {
        System.out.print("C");
    }
}

class A {
    C c = new C();

    A() {
        this("A");
        System.out.print("A");
    }

    A(String s) {
        System.out.print(s);
    }
}