package com.briup.day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test07_FileInputStream {

    // int read(byte[] buff, int off, int len);
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\test\\a.txt");
        //1.创建IO流对象，绑定指定文件
        FileInputStream fis = new FileInputStream(file);

        //2.一次读取多个字节，放入指定位置
        byte[] buff = new byte[6];

        // fis.read(buff);  最常用
        //int len = fis.read(buff,0,buff.length);

        // 0 0 97 98 99 0
        int len = fis.read(buff,2,buff.length-2);
        System.out.println("len: " + len);
        for(int i = 0;i < buff.length; i++) {
            System.out.println(buff[i]);
        }

        //3.关闭资源
        fis.close();
    }

    // 要保证输入流 对应的文件存在
    //int read(byte[]); 一次读取多个字节，放入byte数组中
    public static void main02(String[] args) throws IOException {
        //1.创建IO流对象，绑定指定文件
        FileInputStream fis = new FileInputStream("D:\\test\\a.txt");

        //2.一次读取多个字节
        // 读取成功返回 读取字节长度，读取到文件末尾，返回-1
        byte[] buff = new byte[2];
        int len = fis.read(buff);
        System.out.println("len: " + len);
        for(int i = 0; i < len; i++) {
            System.out.println(buff[i]);
        }

        //再次读取
        len = fis.read(buff);
        System.out.println("第二次读取: " + len);    //-1

        //3.关闭流
        fis.close();
    }

    //int read(); 读取单个字节
    public static void main01(String[] args) throws IOException {

        //1.创建IO流对象，绑定指定文件
        FileInputStream fis = new FileInputStream("D:\\test\\a.txt");

        //2.逐个字节读取文件中内容
        //  读取一个字节返回，如果读取到文件末尾，返回-1
        int v = fis.read();
        System.out.println(v);              //97
        System.out.println(fis.read());     //98
        System.out.println(fis.read());     //99
        System.out.println(fis.read());     //-1
        System.out.println(fis.read());     //-1

        //3.关闭流：释放资源
        fis.close();
    }
}
