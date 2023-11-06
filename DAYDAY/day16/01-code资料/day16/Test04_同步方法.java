package com.briup.day16;

public class Test04_同步方法 {
    public static void main(String[] args) {

        //公共类对象
        Printer p = new Printer();
//        Printer p2 = new Printer();

        Thread th1 = new Thread() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++) {
                    //普通成员同步方法测试
//                    p.print1();

                    //static同步方法测试
                    Printer.print3();
                }
            }
        };

        Thread th2 = new Thread() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++) {
                    //普通成员同步方法测试
//                    p.print2();

                    //static同步方法测试
                    p.print4();
                }
            }
        };

        //2.启动子线程
        th1.start();
        th2.start();
    }
}

class Printer {

    private Object mutex = new Object();

    //同步方法，方法加上synchronized修饰即可
    //  普通方法默认 锁对象 this == p对象
    public synchronized void print1() {
        System.out.print("认");
        System.out.print("真");
        System.out.print("学");
        System.out.print("习");
        System.out.println();
    }

    public void print2() {
        synchronized(this) {
            System.out.print("天");
            System.out.print("天");
            System.out.print("向");
            System.out.print("上");
            System.out.println();
        }
    }

    //static同步方法 默认锁对象 当前类.class，即Printer.class
    public static synchronized void print3() {
        System.out.print("认");
        System.out.print("真");
        System.out.print("学");
        System.out.print("习");
        System.out.println();
    }

    public void print4() {
        synchronized(Printer.class) {
            System.out.print("天");
            System.out.print("天");
            System.out.print("向");
            System.out.print("上");
            System.out.println();
        }
    }
}
