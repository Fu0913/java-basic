package com.briup.day10.homework;

/**
 * @ClassName: Student
 * @Description: TODO
 * @Author: songjl
 * @Date: 2023/10/19 10:34
 * @Version: v1.0
 */
public class Student extends Person implements ISingAble, IFlyAble {
    private String id;
    private double score;

    public Student() {
        super();
    }
    public Student(String name, int age, String id, double score) {
        super(name,age);
        this.id = id;
        this.score = score;
    }

    @Override
    public void fly() {
        System.out.println("学⽣ " + super.getName() + " 学会开⻜机⻜翔");
    }

    @Override
    public void sing() {
        System.out.println("学⽣ " + super.getName() + " 会唱歌");
    }
}
