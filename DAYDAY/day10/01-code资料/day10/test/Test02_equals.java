package com.briup.day10.test;

import java.util.Objects;

public class Test02_equals {
    public static void main(String[] args) {
        Stu s1 = new Stu("zs",21);
        Stu s2 = new Stu("zs",21);

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}

class Stu {
    private String name;
    private int age;

    public Stu() {}
    public Stu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Stu stu = (Stu) o;
        return age == stu.age && Objects.equals(name, stu.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
