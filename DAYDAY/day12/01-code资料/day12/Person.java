package com.briup.day12;

import java.util.Objects;

public class Person implements Comparable<Person> {
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
        //System.out.println("equals ...");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        //System.out.println("hashCode ...");
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //按照姓名降序，姓名相同按年龄升序
    @Override
    public int compareTo(Person o) {
        int r = o.name.compareTo(this.name);
        if(r == 0) {
            r = this.age - o.age;
        }

        return r;
    }
}
