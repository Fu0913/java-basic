package com.briup.day18;

import java.io.*;

public class Test11_对象流 {
    //从 src/dir/stu.txt 中 读取Student对象出来
    public static void main(String[] args) throws Exception {
        //1.实例化对象输入流
        FileInputStream fis = new FileInputStream("src/dir/stu.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        //2.读取对象
//        Object obj = ois.readObject();
//        if(obj instanceof Student) {
//            Student s = (Student) obj;
//        }
        Student stu = (Student) ois.readObject();
        System.out.println("read: " + stu);

        //EOFException: end of file
        stu = (Student) ois.readObject();
        System.out.println("第二次读: " + stu);

        //3.关闭流
        ois.close();
    }

    //创建Student对象 然后写入本地文件 src/dir/stu.txt 中
    public static void main01(String[] args) throws Exception {
        Student stu = new Student("zs",21);

        //1.实例化流对象
        FileOutputStream fos = new FileOutputStream("src/dir/stu.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //2.写入对象到 文件中
        oos.writeObject(stu);
        System.out.println("写入对象成功!");

        //3.关闭流
        oos.close();
    }
}
