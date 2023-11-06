package com.briup.day18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

//以前对异常处理方式：将异常抛出
//对异常进行标准的异常捕获处理
public class Test03_异常处理 {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;

        try {
            //1.实例化流对象
            fr = new FileReader("src/dir/01.png");
            fw = new FileWriter("src/dir/02.png");

            //2.小数组拷贝
            int len = -1;
            char[] buff = new char[1024];
            // 读取到文件末尾，返回-1
            while ((len = fr.read(buff)) != -1) {
                //每次写出 读取到的有效字符
                fw.write(buff, 0, len);
            }
            System.out.println("拷贝成功");
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            //3.关闭流
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
