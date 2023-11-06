package com.briup.day10;

/**
 * @ClassName: Test01
 * @Description: TODO
 * @Author: songjl
 * @Date: 2023/10/19 08:32
 * @Version: v1.0
 */
public class Test01 {
    public static void main(String[] args) {
        Test01 test01 = new Test01();
        test01.first();
    }

    public void first() {
        int i = 5;
        Value v = new Value();
        v.i = 25;
        second(v, i);
        System.out.println(v.i);
    }

    public void second(Value v, int i) {
        i = 0;
        v.i = 20;
        Value val = new Value();
        v = val;
        System.out.println(v.i + " " + i);
    }
}

class Value {
    public int i = 15;
}