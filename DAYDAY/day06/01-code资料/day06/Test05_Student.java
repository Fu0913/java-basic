package com.briup.day06;

//基础类
class Student {
    String name;
    int age;

    public void sayHello() {
        System.out.println("hello");
    }
}

//测试类：包含main方法的类
public class Test05_Student {
    public static void main(String[] args) {
        //1.实例化对象
        Student s1 = new Student();

        //2.操作数据成员
        System.out.println(s1.name);    //null
        System.out.println(s1.age);     //0

        s1.name = "zs";
        s1.age = 21;
        System.out.println(s1.name);
        System.out.println(s1.age);

        //3.对象调用成员方法
        s1.sayHello();

        Student s2 = new Student();
        s2.sayHello();
    }
}
