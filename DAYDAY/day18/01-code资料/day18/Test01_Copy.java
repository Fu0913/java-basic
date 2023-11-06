package com.briup.day18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

//使用字符流 进行 文件拷贝
public class Test01_Copy {
    public static void main(String[] args) throws Exception {
        //1.实例化流对象
        FileReader fr = new FileReader("src/dir/a.txt");
        FileWriter fw = new FileWriter("src/dir/b.txt");

        //2.拷贝
        // 2.1 逐个字符拷贝  当读取到文件末尾，返回-1
//        int value = -1;
//        while((value = fr.read()) != -1) {
//            fw.write(value);
//        }

        // 2.2 小数组拷贝
        int len = -1;
        char[] buff = new char[8];
        // 读取到文件末尾，返回-1
        while((len = fr.read(buff)) != -1) {
            //每次写出 读取到的有效字符
            fw.write(buff,0,len);
        }
        System.out.println("拷贝成功");

        //3.关闭流
        fw.close();
        fr.close();
    }
}
