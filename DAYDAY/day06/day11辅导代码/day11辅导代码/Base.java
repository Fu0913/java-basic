package com.briup.day11;

/**
 * @ClassName: Base
 * @Description: TODO
 * @Author: songjl
 * @Date: 2023/10/20 09:33
 * @Version: v1.0
 */
public class Base {
    private static int baseNum = 100;
    private String baseName = "base";

    public Base() {
        this.callName();
    }

    public void callName() {
        System.out.println(baseName);
    }

    public static void callNum() {
        System.out.println(baseNum);
    }

    static class Sub extends Base {
        private String baseName = "sub";

        public void callName() {
            System.out.println(baseName);
        }
    }

    public static void main(String[] args) {
        new Sub();
    }
}
