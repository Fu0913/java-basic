package com.briup.day17;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test08_FileOutputStream {
    public static void main(String[] args) throws IOException {
        //1.关联流对象和文件
        // 输出流对应的文件不存在也不会有异常，系统会自动创建
        FileOutputStream fos = new FileOutputStream("D:\\test\\b.txt");

        //2.往文件中写入数据
        //一次写入一个字节
        //fos.write(97);
        //fos.write(98);

        //一次写入多个字节
        //byte[] arr = {100,99,98,97};
        //fos.write(arr);

        //将字节数组 指定部分 写入文件
        byte[] arr = "hello world".getBytes();
        fos.write(arr,5,5);

        //3.关闭资源
        fos.close();
    }
}
