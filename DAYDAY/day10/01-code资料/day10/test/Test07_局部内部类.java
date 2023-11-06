package com.briup.day10.test;

public class Test07_局部内部类 {
    public static void main(String[] args) {

        //2.如果在局部内部类访问 局部变量，则 局部变量默认final修饰
        //final int a = 10;
        int a = 10;

        //1.方法内定义的内部类  就是 局部内部类，
        // 其作用范围 仅限于 当前方法
        class Inner {
            private int b = 20;

            public void show() {
                //a = 20; error
                System.out.println("局部变量a: " + a);
                System.out.println("成员变量b: " + b);
            }
        }

        Inner inn = new Inner();
        inn.show();

        //return (Object)inn;

    }
}

