package com.briup.day11;

/**
 * @ClassName: Z
 * @Description: TODO
 * @Author: songjl
 * @Date: 2023/10/20 09:08
 * @Version: v1.0
 */
public class Z extends X {
    Y y = new Y();

    public Z() {
        System.out.print("Z");
    }

    public static void main(String[] args) {
        new Z();
    }
}

class X {
    Y y = new Y();

    public X() {
        System.out.print("X");
    }
}

class Y {
    public Y() {
        System.out.print("Y");
    }
}
