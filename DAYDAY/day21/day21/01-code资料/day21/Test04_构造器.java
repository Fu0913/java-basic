package com.briup.day21;

import java.lang.reflect.Constructor;

public class Test04_构造器 {

    //获取指定参数的 private构造器,并使用构造器实例化对象
    public static void main(String[] args) throws Exception {
        Class c = Student.class;

        //获取任意构造器(含private)
        Constructor con = c.getDeclaredConstructor(String.class);

        //借助私有构造器实例化对象
        // 1.开启私有构造器的访问权限
        con.setAccessible(true);

        // 2.调用私有构造器
        Student s = (Student) con.newInstance("012");
        System.out.println(s);
    }

    //获取指定参数的public构造器,并使用构造器实例化对象
    public static void main02(String[] args) throws Exception {
        //1.获取字节码对象
        Class c = Class.forName("com.briup.day21.Student");

        //2.获取指定的构造器
        // 获取public 无参构造器
        Constructor c1 = c.getConstructor();
        System.out.println(c1);
        // 使用构造器实例化对象
        Student s1 = (Student) c1.newInstance();
        System.out.println("s1: " + s1);

        System.out.println("--------------");

        // 获取public 三参构造器
        Constructor c2 =
                c.getConstructor(String.class, String.class, int.class);
        System.out.println(c2);

        Student s2 = (Student) c2.newInstance("002","jack",21);
        System.out.println(s2);
    }

    //获取所有的构造器，并使用反射的方式去创建对象
    public static void main01(String[] args) throws Exception {
//        Student s1 = new Student();
//        Student s2 = new Student("003");      error
//        Student s3 = new Student("003","tom",21);

        //1.获取字节码对象
        Class c1 = Class.forName("com.briup.day21.Student");

        //2.根据字节码对象 创建类对象（借助该类的无参构造器）
        //  前提条件：1.存在无参构造器  2.权限符合要求
        Object o = c1.newInstance();
        Student s = (Student) o;
        System.out.println(s.toString());

        System.out.println("------------");

        //3.获取所有的 公有构造器对象
        Constructor[] cons = c1.getConstructors();
        for(Constructor c : cons) {
            System.out.println(c);
        }

        System.out.println("-------------");
        //4.获取所有的构造器(含 private 默认 protected ...)
        Constructor[] cons2 = c1.getDeclaredConstructors();
        for(Constructor c : cons2) {
            System.out.println(c);
        }

    }
}
