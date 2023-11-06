package com.briup.day18;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test12_List {
    //从list.txt读取集合对象，然后拆分出所有的Student对象
    public static void main(String[] args) throws Exception {
        //1.实例化 对象流
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("src/dir/list.txt"));

        //2.读取集合对象
        List<Student> list = (List<Student>) ois.readObject();
        //拆分输出所有的学生信息
        for (Student s : list) {
            System.out.println(s);
        }

        //3.关闭流
        ois.close();
    }

    //添加多个Student对象到list中，然后将list写入 list.txt
    public static void main01(String[] args) throws Exception {
        //1.准备集合对象
        Student s1 = new Student("zs",21);
        Student s2 = new Student("tom",20);
        Student s3 = new Student("rose",21);

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //2.实例化 对象流
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("src/dir/list.txt"));

        //3.写入集合对象
        oos.writeObject(list);
        System.out.println("对象写入完成");

        //4.关闭资源
        oos.close();
    }
}
