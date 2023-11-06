package com.briup.io.day03;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 按照GBK编码读取 D:\\test\\File_GBK.txt 文件内容，然后写入UTF-8编码
 * 文件 D:\\test\\File_UTF8.txt 。注意拷贝效率，注意新文件中不要出现多
 * 余的空行。
 */
public class Test028_Copy {
    public static void main(String[] args) throws IOException {
        // 声明流、创建流
        FileInputStream fis = new FileInputStream("/Users/chris_songjl/Desktop/File_GB2312.txt");
        InputStreamReader isr = new InputStreamReader(fis, "GB2312");

        FileOutputStream fos = new FileOutputStream("/Users/chris_songjl/Desktop/File_UTF8.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);

        // 使用
        char[] chars = new char[100];
        int len = -1;
        while ((len = isr.read(chars)) != -1) {
            // 一边读一边写
            osw.write(chars, 0, len);
        }
        System.out.println("文件拷贝成功");
        // 关闭流
        osw.close();
        isr.close();
    }
}
