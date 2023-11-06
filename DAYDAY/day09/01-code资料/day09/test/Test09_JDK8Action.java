package com.briup.day09.test;

public class Test09_JDK8Action {
    public static void main(String[] args) {
        System.out.println(JDK8Action.OPS_MODE);
        JDK8Action.sFun();


        JDK8Action j = new Demo01();
        j.dFun();

        //接口中的静态方法，只能通过 接口名.static方法 调用
        //JDK8Action.sFun();      Ok
        //j.sFun();               error
        //Demo01.sFun();          error
    }
}

class Demo01 implements JDK8Action {
    @Override
    public void start() {
        System.out.println("in Demo01 start()...");
    }

    @Override
    public void stop() {
        System.out.println("in Demo01 stop()...");
    }
}

interface JDK8Action {
    // 接口中静态常量
    String OPS_MODE = "auto";

    // 接口中抽象方法
    void start();
    void stop();

    //private void test() {}

    //下面是JDK8新特性
    //默认方法
    public default void dFun() {
        System.out.println("in default fun() ...");
    }

    //静态方法
    public static void sFun() {
        System.out.println("in static fun() ...");
    }
}
