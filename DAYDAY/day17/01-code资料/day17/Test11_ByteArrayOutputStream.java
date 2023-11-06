package com.briup.day17;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test11_ByteArrayOutputStream {
    public static void main(String[] args) throws Exception {

        //1.创建流对象
        FileInputStream fis =
                new FileInputStream("D:\\test\\a.txt");
        ByteArrayOutputStream bos =
                new ByteArrayOutputStream();

        //2.从文件中小数组 方式读取所有内容
        int len = -1;
        byte[] buff = new byte[4];
        while((len = fis.read(buff)) != -1) {
            //将读取的内容 写入 字节输出流
            bos.write(buff,0,len);
        }
        System.out.println("拷贝完成");

        //3.及时关闭 没有用的流
        fis.close();

        //4.获取字节输出流中  字节数组数据
        byte[] bytes = bos.toByteArray();
        //byte[] --> String
        String str = new String(bytes);
        System.out.println("read: " + str);

        //5.关闭字节流对象 【注意：内存流 不需要 close】
        bos.close();
    }
}
