package com.briup.day10.homework;

/**
 * @ClassName: Test1_6_Zoo
 * @Description: TODO
 * @Author: songjl
 * @Date: 2023/10/19 10:18
 * @Version: v1.0
 */
public class Test1_6_Zoo {
    public static void main(String[] args) {
        Animal cat = new Cat("tom", "灰⽩");
        Animal dog = new Dog("旺财", 5);
        Animal bird = new Bird("樱桃", 21.76);
        cat.makeSound();// 猫发出喵喵叫声
        cat.move();// 猫在四腿爬⾏
        dog.makeSound();// 狗发出汪汪叫声
        dog.move();// 狗在四腿奔跑
        bird.makeSound();//⻦发出啾啾叫声
        bird.move();//⻦在⻜翔
    }
}

abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();

    abstract void move();
}

class Cat extends Animal {

    private String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    void makeSound() {
        System.out.println("猫发出喵喵叫声");
    }

    @Override
    void move() {
        System.out.println("猫在四腿爬⾏");
    }
}

class Dog extends Animal {

    private int age;

    public Dog(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    void makeSound() {
        System.out.println("狗发出汪汪叫声");
    }

    @Override
    void move() {
        System.out.println("狗在四腿奔跑");
    }
}

class Bird extends Animal {

    private double wingSpan;

    public Bird(String name, double wingSpan) {
        super(name);
        this.wingSpan = wingSpan;
    }

    @Override
    void makeSound() {
        System.out.println("⻦发出啾啾叫声");
    }

    @Override
    void move() {
        System.out.println("⻦在⻜翔");
    }
}