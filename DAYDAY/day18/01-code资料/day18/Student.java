package com.briup.day18;

import java.io.Serializable;

//如果要序列化或反序列化 基础类，则该类一定要实现 序列化接口
public class Student implements Serializable {
    //每一个Java类，都存在默认序列号，一旦类属性、方法改变，序列号就会发生改变
    //添加序列号为固定值1
    private static final long serialVersionUID = 1L;

    private String name;
    //添加修饰符 序列号或反序列化时 忽略 age属性
    private transient int age;

    public Student() {}
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
