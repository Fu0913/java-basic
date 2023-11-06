package com.briup.day10.test;

public class Test06_static内部类 {
    public static void main(String[] args) {
        Outer2 o = new Outer2();
        o.disp();

        System.out.println("-------------");

        // static内部类实例化对象格式：
        // 外部类.内部类 引用 = new 外部类.内部类(实际参数);
        Outer2.Inner inn = new Outer2.Inner();
        inn.show();
    }
}

class Outer2 {
    private int o_num = 10;
    static int so_num = 20;
    public void test() {}

    static class Inner {
        private int i_num = 30;
        static int si_num = 40;
        static int so_num = 50;

        public void show() {
            System.out.println("i_num" + i_num);
            System.out.println("si_num" + si_num);
            //1.static内部类中所有方法 都不可以访问 外部类 非static成员或方法
            //System.out.println("o_num" + o_num);error
            //test(); error
            System.out.println("so_num" + so_num);
            System.out.println("Outer2.so_num" + Outer2.so_num);
        }
    }

    public void disp() {
        Inner inn = new Inner();
        System.out.println("in outer disp, inn.i_num: " + inn.i_num);
        System.out.println("in outer disp, Inner.si_num: " + Inner.si_num);
    }

}
