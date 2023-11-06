package com.briup.day07.test;

public class Test08_Animal {
    public static void main(String[] args) {
        Dog d = new Dog();

        //子类新增方法
        d.setName("jack");
        //从父类继承的方法
        d.setAge(2);
        d.setColor("yellow");

        d.show();
    }
}

//子类
class Dog extends Animal {
    private String name;
    //完全继承 color age，但不具有直接访问权限

    public void show() {
        //调用从父类继承的方法 getColor  getAge
        String color = getColor();
        int age = getAge();
        System.out.println("Dog: " + color + ", " + age + ", " + name);
    }

    public void setName(String name) {
        this.name = name;
    }
}

//基础类 父类
class Animal {
    private String color;
    private int age;

    public Animal() {}
    public Animal(String color,int age) {
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
