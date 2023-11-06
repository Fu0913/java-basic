package com.briup.day21;

/*
    不同的方式去获取字节码对象
    注意：每个类的字节码对象 是唯一的
 */
public class Test03_字节码对象 {

    //基本数据类型及数组 获取 字节码对象
    public static void main(String[] args) {
        Class c1 = int.class;
        Class c2 = double.class;
        Class c3 = int[].class;
        int[] arr = new int[3];
        Class c4 = arr.getClass();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        System.out.println(c3 == c4);
    }

    //自定义类 获取 字节码对象
    public static void mai02(String[] args) throws ClassNotFoundException {
        //第三种方式获取字节码对象
        Class c1 = Class.forName("com.briup.day21.Student");

        //通过静态成员 获取字节码对象
        Class c2 = Student.class;

        //通过对象成员方法 获取字节码对象
        //Student s = new Student();
        //Class c3 = s.getClass();

        System.out.println(c1);
        System.out.println(c1 == c2);
        //System.out.println(c3 == c2);

    }

    //获取java.lang.String字节码对象
    public static void main01(String[] args) {
        String str = "hello";
        Class c1 = str.getClass();

        Class c2 = String.class;

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println(c1 == c2);
    }
}
