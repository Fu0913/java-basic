package com.briup.homework.day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.List;

//从指定文件 src/dir/list.txt 读取list然后遍历输出
public class Test10_读取list {
    public static void main(String[] args) throws Exception {
        //1.
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("src/dir/list.txt"));

        //2.读取集合对象
        List<Student> list = (List<Student>) ois.readObject();

        //遍历集合内容
        for(Student s : list) {
            System.out.println(s);
        }

        //3.关闭流
        ois.close();
    }
}
