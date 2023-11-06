package com.briup.day21;

public class Student {
    private String id;
    public String name;
    int age;

    public Student() {
        System.out.println("public Student() ...");
    }
    private Student(String id) {
        System.out.println("public Student(String) ...");
        this.id = id;
    }
    public Student(String id, String name, int age) {
        System.out.println("public Student(String,String,int) ...");
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    private int getAge() {
        return age;
    }
    private void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
