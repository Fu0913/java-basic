package com.briup.day08.bean;

public class Person {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
        //this.setName("unknown");
        setName("unknown");
    }

    //重写toString方法
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        //this.name = "ww";

        Person p = new Person();
        p.name = "zs";
        System.out.println(p.toString());
    }

}
