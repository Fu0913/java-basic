package com.briup.day18;

import java.io.FileReader;
import java.io.FileWriter;

//使用字符流 进行 文件拷贝
public class Test04_JDK7异常处理 {
    public static void main(String[] args) {

        //JDK7新增异常处理格式: 不需要显式的close流，系统会自动处理
        //1.实例化流对象
        try(FileReader fr = new FileReader("src/dir/c.txt");
            FileWriter fw = new FileWriter("src/dir/b.txt")) {

            //2.小数组拷贝
            int len = -1;
            char[] buff = new char[8];
            // 读取到文件末尾，返回-1
            while((len = fr.read(buff)) != -1) {
                //每次写出 读取到的有效字符
                fw.write(buff,0,len);
            }
            System.out.println("拷贝成功");
        }catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("main end...");
    }
}
