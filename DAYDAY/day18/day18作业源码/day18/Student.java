package com.briup.homework.day18;

import java.io.Serializable;

//注意，一定要实现序列化接口
public class Student implements Serializable {
    private String name;
    private String id;
    private int age;

    public Student() {}
    public Student(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}
