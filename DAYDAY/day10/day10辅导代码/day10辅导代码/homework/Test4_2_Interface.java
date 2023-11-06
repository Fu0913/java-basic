package com.briup.day10.homework;

/**
 * @ClassName: Test4_2_Interface
 * @Description: TODO
 * @Author: songjl
 * @Date: 2023/10/19 10:27
 * @Version: v1.0
 */
public class Test4_2_Interface {
    public static void main(String[] args) {
        Fly bird = new Bird1();
        bird.flyAction(); //⻦会⻜⾏
        Fly plane = new Plane();
        plane.flyAction(); //⻜机能⻜⾏
    }
}

interface Fly {

    void flyAction();
}

class Bird1 implements Fly {

    @Override
    public void flyAction() {
        System.out.println("⻦会⻜⾏");
    }
}

class Plane implements Fly {

    @Override
    public void flyAction() {
        System.out.println("⻜机能⻜⾏");
    }
}