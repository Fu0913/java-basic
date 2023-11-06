package com.briup.day07.test;

class B {
    public static B b = new B();
    public static B b2 = new B();

    {
        System.out.println("构造块");
    }

    static {
        System.out.println("静态块");
    }
}

public class Test05_面试题 {
    public static void main(String[] args) {
        B b = new B();
    }
}
