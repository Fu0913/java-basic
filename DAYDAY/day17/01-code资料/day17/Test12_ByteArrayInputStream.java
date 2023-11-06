package com.briup.day17;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test12_ByteArrayInputStream {
    public static void main(String[] args) throws Exception {
        //1.从键盘录入字符串 转换成 byte[]
        Scanner sc = new Scanner(System.in);
        System.out.println("input a line:");
        String line = sc.nextLine();
        //String -> byte[]
        byte[] buff = line.getBytes();

        //2.实例化流对象
        ByteArrayInputStream bis = new ByteArrayInputStream(buff);
        //      相对路径 相对于 当前项目
        FileOutputStream fos = new FileOutputStream("src/b.txt");

        //3.从字节输入流读取数据，写入到 文件输出流
        int len = -1;
        byte[] arr = new byte[4];
        while((len = bis.read(arr)) != -1) {
            fos.write(arr,0,len);
        }
        System.out.println("拷贝完成！");

        //4.关闭资源
        fos.close();
        //bis.close();
    }
}
