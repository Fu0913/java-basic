package com.briup.day17;

import java.io.*;

public class Test09_Copy {

    //小数组拷贝
    public static void main(String[] args) throws IOException {
        //1.关联文件和流对象
        FileInputStream fis = new FileInputStream("D:\\test\\a.txt");
        FileOutputStream fos = new FileOutputStream("D:\\test\\b.txt");

        //2.小数组拷贝
        int len = -1;
        byte[] arr = new byte[4];
        while((len = fis.read(arr)) != -1) {
            fos.write(arr,0,len);
        }

        // abcd12
//        while(true) {
//            len = fis.read(arr);    //abcd  12cd
//            if(len == -1)
//                break;
//
//            fos.write(arr,0,len);         //abcd  12
//        }

        System.out.println("拷贝完成");

        //3.关闭资源：先创建的后关闭，后创建的先关闭
        fos.close();
        fis.close();
    }

    //将 D:\test\a.txt 内容全部拷贝到 D:\test\b.txt
    public static void main01(String[] args) throws IOException {
        //1.关联文件和流对象
        FileInputStream fis = new FileInputStream("D:\\test\\a.txt");
        FileOutputStream fos = new FileOutputStream("D:\\test\\b.txt");

        //2.逐个字节拷贝
        int v = -1;
//        while(true) {
//            v = fis.read();
//            if(v == -1)
//                break;
//
//            fos.write(v);
//        }
        //简化写法
        while((v = fis.read()) != -1) {
            fos.write(v);
        }
        System.out.println("拷贝完成");

        //3.关闭资源：先创建的后关闭，后创建的先关闭
        fos.close();
        fis.close();
    }
}
