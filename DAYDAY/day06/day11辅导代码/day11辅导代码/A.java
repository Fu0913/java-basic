package com.briup.day11;

/**
 * @ClassName: A
 * @Description: TODO
 * @Author: songjl
 * @Date: 2023/10/20 08:11
 * @Version: v1.0
 */
public class A {

}
class B extends A {
    void test() {
        System.out.println(super.getClass().getSimpleName());
        System.out.println(this.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        new B().test();
    }
}
