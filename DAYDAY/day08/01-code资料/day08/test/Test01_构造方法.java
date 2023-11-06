package com.briup.day08.test;

import com.briup.day08.bean.Person;

public class Test01_构造方法 {

    public static void main(String[] args) {
        Zi z = new Zi();

        z.disp();

        //z.show(30);
    }
}

// class Fu extends Object
class Fu {
    //显式初始化
    protected int n = 10;

    public Fu() {
        System.out.println("Fu() ...");
    }
    public Fu(int n) {
        System.out.println("Fu(int) ...");
        this.n = n;
    }

    public void disp() {
        String str = super.toString();
        System.out.println("toString(): " + str);

        //super.hashCode();

        System.out.println("in Fu disp, n: " + n);
    }
}

class Zi extends Fu {
    //子类新增同名成员
    public int n = 20;

    public void show() {
        System.out.println("super.n: " + super.n);
        System.out.println("this.n: " + this.n);
        System.out.println("n: " + n);
    }

    public void show(int n) {
        //super.disp();

        System.out.println("super.n: " + super.n);
        System.out.println("this.n: " + this.n);
        System.out.println("n: " + n);
    }

    public Zi() {
        //如果子类调用是父类 无参构造器 super()
        //那么改行代码可以省略，系统会自动调用super();
        //super();

        super(10);

        System.out.println("Zi() ...");
    }
}