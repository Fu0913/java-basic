package com.briup.io.day03;

import java.io.*;

/**
 * 准备Student类，使用对象流将学生对象保存在文件中，并读取出来。
 */
public class Test029_WriteObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 写入文件
        // 声明流
        // FileOutputStream fos = new FileOutputStream("src/dir/obj.txt");
        // ObjectOutputStream oos = new ObjectOutputStream(fos);
        // // 创建学生对象
        // Student student = new Student("zhangsan", 20);
        // oos.writeObject(student);
        //
        // System.out.println(student + "写入文件完毕");
        // oos.close();

        // 读取文件 -> 反序列化
        FileInputStream fis = new FileInputStream("src/dir/obj.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student student = (Student) ois.readObject();
        // Student student1 = (Student) ois.readObject(); EOFException：读取对象的个数大于写入对象的个数
        System.out.println("从文件中读取到学生对象：" + student);
        // System.out.println("student1 = " + student1);
    }
}
