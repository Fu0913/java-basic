package com.briup.day10.test;

public class Test05_成员内部类 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.disp();

        System.out.println("-----------");

        //实例化内部类对象
        //1.固定格式：
        //  外部类.内部类 引用名 = 外部类对象.new 内部类(实际参数);
        Outer.Inner inn = new Outer().new Inner();
        inn.show();

        //
        Outer.Inner inn2 = o.new Inner();
        inn2.show();
    }
}

class Outer {
    private int o_num = 10;

    //成员内部类：2.不能包含 static成员 和 static方法
    class Inner {
        private int i_num = 20;
        private int o_num = 30;
        //static int s_num = 20; error
        //public static void sFun() {} error

        public void show() {
            System.out.println("i_num: " + i_num);
            // 3.如果访问外部类普通成员  外部类名.this.成员名
            System.out.println("Outer.this.o_num: " + Outer.this.o_num);
            System.out.println("o_num: " + o_num);
        }
    }

    public void disp() {
        System.out.println("in Outer disp, o_num: " + o_num);
        //实例化内部类对象
        // Outer.Inner
        Inner inn = new Inner();
        System.out.println("in Outer disp, i_num: " + inn.i_num);
    }
}
