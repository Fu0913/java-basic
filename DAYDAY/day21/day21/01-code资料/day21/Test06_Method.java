package com.briup.day21;

import java.lang.reflect.Method;

public class Test06_Method {
    //2.获取指定的Method
    public static void main(String[] args) throws Exception {
        //1.获取字节码对象
        Class<Student> clazz = Student.class;
        Student s = new Student();

        //2.获取指定public成员方法
        Method m1 = clazz.getMethod("setId", String.class);
        // 使用Method，实现对象方法的调用
        //  等同 s.setId("002");
        m1.invoke(s,"002");
        System.out.println("s: " + s);

        System.out.println("-----------------------");

        //3.获取指定成员方法（含private）
        Method m2 = clazz.getDeclaredMethod("setAge", int.class);
        //放开访问权限
        m2.setAccessible(true);
        m2.invoke(s,20);

        System.out.println("s: " + s);

        //调用 int age = s.getAge();
        Method m3 = clazz.getDeclaredMethod("getAge");
        m3.setAccessible(true);
        int age = (int) m3.invoke(s);
        System.out.println("s.age: " + age);

    }

    //1.获取指定类的Method对象并遍历
    public static void main01(String[] args) {
        //1.获取字节码对象
        Class<Student> clazz = Student.class;

        //2.获取public方法（含继承）
        Method[] methods = clazz.getMethods();
        for(Method m : methods) {
            System.out.println(m);
        }

        System.out.println("---------------");

        //3.获取所有方法(含private，不含继承)
        methods = clazz.getDeclaredMethods();
        for(Method m : methods) {
            System.out.println(m);
        }
    }

}
