package com.briup.day18;

import java.io.*;

//utf-8项目 读取 gbk文件 在控制台输出
public class Test09_ReadGBK {
    //使用 转换流 去解决乱码问题
    public static void main(String[] args) throws Exception {
        FileInputStream fis =
                new FileInputStream("src/dir/File_GBK.txt");
        //  按照GBK编码去读取文件内容
        InputStreamReader isr =
                new InputStreamReader(fis,"GBK");
        // 进一步增强，提高性能
        BufferedReader br = new BufferedReader(isr);

        //逐行读取内容然后输出
        String line = null;
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }

    //使用普通流 实现读取功能：出现乱码
    public static void main01(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                new FileReader("src/dir/File_GBK.txt"));

        String line = null;
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
