package com.briup.day09.test;

public class Test01_Final {
    //overridden method is final
    //public void wait(long timeout) {}

    public static void main(String[] args) {
        final int a = 10;
        //a = 20;
        System.out.println(a);

        int b = 10;
        init(b);

        System.out.println("-----------");

        //final修饰引用数据类型变量，该变量标识的内存中的值(栈) 不能修改
        // 但其引用那块内存中的值(堆) 可以 修改
        final Demo d = new Demo();
        d.n = 10;
        d.n = 20;

        //d = new Demo(); error

    }

    public static void init(final int a) {
        //a = 2*a;
    }
}

class Demo {
    int n;
}

//shift 按2下

//1.final修饰类 不能作为父类使用
//class MyString extends String {
//}
