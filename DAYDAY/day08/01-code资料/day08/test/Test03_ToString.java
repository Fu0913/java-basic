package com.briup.day08.test;

import com.briup.day08.bean.Person;

public class Test03_ToString {
    public static void main(String[] args) {
        Demo d1 = new Demo();

        //toString作用
        System.out.println(d1);
        System.out.println(d1.toString());

        //一般情况下定义类：
        //  1.提供无参构造器
        //  2.get|set方法
        //  3.重写toString()
        Person p = new Person();
        p.setName("zs");

        System.out.println(p);

        System.out.println("------------");
        Manager m = new Manager("002","kevin",200);
        System.out.println(m);
    }
}

class Demo {
    private int n = 10;

}
