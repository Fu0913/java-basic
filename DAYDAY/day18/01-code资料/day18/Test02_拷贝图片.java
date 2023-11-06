package com.briup.day18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test02_拷贝图片 {
    public static void main(String[] args) throws IOException {
        //1.实例化流对象
        FileReader fr = new FileReader("src/dir/01.png");
        FileWriter fw = new FileWriter("src/dir/02.png");

        //2.小数组拷贝
        int len = -1;
        char[] buff = new char[1024];
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
