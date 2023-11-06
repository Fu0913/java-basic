package com.briup.homework.day18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
从键盘录入学生信息，格式为：姓名-学号-年龄，遇到quit结束录入
例如:
	zs-001-21
	ww-003-20
	tom-002-19
	quit
将每行数据转换成Student对象，然后添加到集合中，最后写入到文件src/dir/list.txt中。
再编写一个程序，从src/dir/list.txt读取出所有学生的信息然后遍历输出。
 */
public class Test09_对象流 {
    public static void main(String[] args) throws Exception {
        //1.从键盘录入学生信息
        Scanner sc = new Scanner(System.in);
        System.out.println("输入学生信息，格式：姓名-学号-年龄");
        //提前准备集合，存储录入的学生对象
        List<Student> list = new ArrayList<>();
        while(true) {
            String line = sc.nextLine();
            //遇到quit结束录入
            if("quit".equals(line))
                break;

            //拆分学生属性信息，封装得到Student对象
            String[] arr = line.split("-");
            String name = arr[0];
            String id = arr[1];
            int age = Integer.parseInt(arr[2]);

            //创建学生对象
            Student s = new Student(name,id,age);

            //将学生添加到集合
            list.add(s);
        }

        //2.将list对象，写入指定文件 src/dir/list.txt
        FileOutputStream fos = new FileOutputStream("src/dir/list.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //将集合对象写入文件
        oos.writeObject(list);
        System.out.println("write list success!");

        //关闭资源
        oos.close();
    }
}
