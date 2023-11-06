package com.briup.day12;

import java.util.Objects;

//自定义对象 实现 比较排序接口
public class Student implements Comparable {
    private String name;
    private int age;

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
    public boolean equals(Object o) {
//        System.out.println("equals ...");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
//        System.out.println("hashCode ...");
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //指定排序规则：先按照年龄升序，如果年龄相同则按照姓名降序
    @Override
    public int compareTo(Object o) {
        Student s = (Student)o;

        //比较this和o两个对象的大小
        // 以this为准，则升序；以o为准则降序
        int r = this.age - s.age;
        if(r == 0) {
            r = s.name.compareTo(this.name);
        }

        return r;
    }
}
