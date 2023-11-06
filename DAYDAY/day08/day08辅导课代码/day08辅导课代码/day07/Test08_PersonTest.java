package com.briup.day07;

/**
 * @ClassName: Test08_PersonTest
 * @Description: TODO
 * @Author: songjl
 * @Date: 2023/10/17 08:30
 * @Version: v1.0
 */
public class Test08_PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("jack", 21);
        p1.show();
        System.out.println("--------------");
        Person p2 = new Person("lucy");
        p2.show();
    }
}

class Person {
    private String name;
    private int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this(name, 0);
    }

    public void show() {
        System.out.println(name + " " + age);
    }
}
