package com.briup.day09.test;

public class Test08_Animal {
    public static void main(String[] args) {
        Animal2 a = new Monkey("yellow",2,"悟空");
        //编译看左边 运行看右边
        a.eat();

        if(a instanceof IJumpAble) {
            IJumpAble j = (IJumpAble) a;
            j.jump();
        }

        if(a instanceof ICycleAble) {
            ICycleAble c = (ICycleAble) a;
            c.cycle();
        }

        if(a instanceof Runnable) {
            Runnable r = (Runnable) a;
            r.run();
        }

        System.out.println("----------");

        //用接口引用 指向 实现类对象
        Runnable r = new Monkey("yellow",200,"美猴王");
        r.run();
    }
}

interface Runnable {
    void run();
}

//接口和接口是 继承关系(多继承)
//跳火圈
interface IJumpAble extends Runnable {
    public abstract void jump();
}

//骑自行车 功能
interface ICycleAble {
    void cycle();
}

//类和类        继承关系
//类和接口      实现关系
//接口和接口     继承关系
//  一个接口(子接口) 可以同时 继承 1个或多个其他接口(父接口)

//子类 猴子
//  子类可以同时继承一个父类，实现多个接口
class Monkey extends Animal2 implements IJumpAble,ICycleAble {
    private String name;

    public Monkey() {}

    public Monkey(String color,int age,String name) {
        super(color, age);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("I am " + name + " 喜欢吃香蕉");
    }

    @Override
    public void jump() {
        System.out.println("跳火圈");
    }

    @Override
    public void cycle() {
        System.out.println("骑自行车");
    }

    @Override
    public void run() {
        System.out.println("跑步");
    }
}

abstract class Animal2 {

    private String color;
    private int age;

    //抽象类存在构造方法,为什么?
    public Animal2() {}
    public Animal2(String color, int age) {
        this.color = color;
        this.age = age;
    }

    //抽象方法：abstract修饰、没有方法体
    public abstract void eat();
}
