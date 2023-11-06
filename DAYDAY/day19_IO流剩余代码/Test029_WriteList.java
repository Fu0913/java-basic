package com.briup.io.day03;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 往src/dir/list.txt
 *
 * 集合的序列化
 * 集合中的数据也需要实现序列化接口
 */
public class Test029_WriteList {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        // 创建学生集合
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("mike", 20);
        Student student2 = new Student("lily", 21);
        Student student3 = new Student("lucy", 22);
        students.add(student1);
        students.add(student2);
        students.add(student3);

        // 将集合对象写入到文件中
        FileOutputStream fos = new FileOutputStream("src/dir/list.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(students);
        System.out.println("学生信息的集合写入文件完毕");

        // 线程休眠1000，模拟读取文件的耗时
        Thread.sleep(1000);

        // 读取文件中的集合对象
        FileInputStream fis = new FileInputStream("src/dir/list.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        List<Student> list = (List<Student>) ois.readObject();
        System.out.println("从文件中读取到的学生信息：");
        list.forEach(System.out::println);
    }
}
