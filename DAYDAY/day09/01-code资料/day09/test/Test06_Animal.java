package com.briup.day09.test;

import java.time.Year;

public class Test06_Animal {
    public static void main(String[] args) {
        //抽象类特点：有得有失
        // 1.抽象类 失去了 实例化对象功能
        // 2.抽象类 得到了 包含抽象方法功能
        //Animal a = new Animal();

        Animal a = new Cat("yellow",2,2);
        a.eat();
        a.sleep();

        if(a instanceof Cat) {
            Cat c = (Cat) a;
            c.play();
        }

        System.out.println("-----------");

        a = new Dog("black",1,6);
        a.eat();
        a.sleep();
        if(a instanceof Dog) {
            Dog d = (Dog) a;
            d.lookHome();
        }
    }
}

//抽象类和抽象方法的关系
// 1.抽象类中 可以包含抽象方法（可有可无）
// 2.包含抽象方法的类，一定是抽象类

//抽象类的子类，如果重写所有的抽象方法，则其为正常类，否则其仍旧为抽象类
class Dog extends Animal {
    private int loyalValue;

    public Dog() {}
    public Dog(String color,int age,int loyalValue) {
        super(color, age);
        this.loyalValue = loyalValue;
    }

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    @Override
    void sleep() {
        System.out.println("狗趴着睡");
    }

    //新增方法
    public void lookHome() {
        System.out.println("狗可以帮我们看门");
    }
}


class Cat extends Animal {
    //温顺度：1-10
    private int meekValue;

    public Cat() {}
    public Cat(String color,int age,int meekValue) {
        super(color,age);
        this.meekValue = meekValue;
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("猫躺着睡");
    }

    //新增方法
    public void play() {
        System.out.println("猫可以配我们玩");
    }
}

//如何将一个类 设置为 抽象类？
//  加上abstract修饰即可
abstract class Animal {

    private String color;
    private int age;

    //抽象类存在构造方法,为什么?
    public Animal() {}
    public Animal(String color, int age) {
        this.color = color;
        this.age = age;
    }

    //抽象方法：abstract修饰、没有方法体
    public abstract void eat();

    void sleep() {}
}


