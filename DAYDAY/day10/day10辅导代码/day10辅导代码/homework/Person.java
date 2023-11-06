package com.briup.day10.homework;

/**
 * @ClassName: Person
 * @Description: TODO
 * @Author: songjl
 * @Date: 2023/10/19 10:32
 * @Version: v1.0
 */
public class Person {
    private String name;
    private int age;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void run() {
        System.out.println(name + " 在奔跑");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
