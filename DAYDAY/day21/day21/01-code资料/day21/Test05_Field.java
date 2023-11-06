package com.briup.day21;

import java.lang.reflect.Field;

/*
    通过反射获取类的数据成员
 */
public class Test05_Field {
    //获取指定数据成员Field对象(含private)，并通过其进行赋值 获取值
    public static void main(String[] args) throws Exception {
        Student s = new Student();

        //1.获取字节码对象
        Class<? extends Student> clazz = s.getClass();

        //获取 非public数据成员对象
        Field ageField = clazz.getDeclaredField("age");
        Field idField = clazz.getDeclaredField("id");
        System.out.println(ageField);
        System.out.println(idField);

        //根据field设置指定对象属性值
        ageField.set(s,21);

        //通过私有数据成员Field对象 设置|获取 属性值，需要额外放开访问权限
        idField.setAccessible(true);
        idField.set(s,"010");

        System.out.println(s);
        System.out.println("s.id: " + idField.get(s));
        System.out.println("s.age: " + ageField.get(s));

    }

    //获取指定public 数据成员Field对象，并通过其进行赋值 获取值
    public static void main02(String[] args) throws Exception {
        Student s = new Student();

        //1.获取字节码对象
        Class<? extends Student> clazz = s.getClass();

        //2.获取public属性
        //  String name;
        Field nameField = clazz.getField("name");
        System.out.println(nameField);

        //通过Field设置 指定对象属性值
        // s.setName("tom");
        nameField.set(s,"tom");
        System.out.println("after set name, s: " + s);

        //通过Field获取 指定对象的属性值
        //  等同于 String name = s.getName();
        String name = (String) nameField.get(s);
        System.out.println("name: " + name);
    }

    //获取所有的数据成员 并遍历
    public static void main01(String[] args) {
        //1.获取字节码对象
        Class<HighStudent> clazz = HighStudent.class;

        //2.获取public 属性(含从父类继承的)
        Field[] fields = clazz.getFields();
        for(Field f : fields) {
            System.out.println(f);
        }

        System.out.println("-------------");

        //3.获取所有的属性【当前类所有属性，不包含父类继承的】
        fields = clazz.getDeclaredFields();
        for(Field f : fields) {
            System.out.println(f);
        }

    }
}
