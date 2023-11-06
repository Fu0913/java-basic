package com.briup.io.day03;

import java.io.Serializable;
import java.util.List;

/**
 * Serializable标记接口
 * 实现Serializable标记接口，该类可以被序列化
 *
 *
 * serialVersionUID ：默认提供
 *
 * private static final long serialVersionUID = 1L
 */
public class Student implements Serializable {

    // private static final Long serialVersionUID = 1L;

    private String name;

    // transient关键字修饰属性，代表该属性不会被序列化
    // 一般用于敏感信息
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
