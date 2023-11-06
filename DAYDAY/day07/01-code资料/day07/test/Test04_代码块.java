package com.briup.day07.test;

public class Test04_代码块 {

    //构造代码块   static代码
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo(5);
        System.out.println("n: " + d2.getN());

        System.out.println(Demo.value);

    }

    //局部代码块
    public static void main01(String[] args) {
        int a = 10;

        //局部代码块
        {
            int b = 20;
            System.out.println("a: " + a);
            System.out.println("b: " + b);
        }

        System.out.println("a: " + a);
        int b = 30;
        System.out.println("b: " + b);
    }
}

class Demo {

    private int n = 10;

    //类中 方法外，static代码块
    static {
        //随着类加载执行
        value = 20;
        System.out.println("static 代码块 ...");
    }

    //static成员：显式初始化
    public static int value = 10;

    //构造代码块: 类中方法外
    //  每次构造方法执行前，先执行构造代码块
    {
        System.out.println("构造代码块...");
    }

    public Demo() {
        System.out.println("Demo()...");
    }
    public Demo(int n) {
        System.out.println("Demo(int)...");
        this.n = n;
    }

    public int getN() {
        return n;
    }
}





