package com.briup.day18;

import java.io.*;

//使用缓冲输入流 + 打印流 实现文件拷贝 最终版本
public class Test07_PrintStream {

    public static void main(String[] args) throws Exception {
        //1.实例化流对象
        BufferedReader br = new BufferedReader(
                new FileReader("src/dir/a.txt"));

        PrintStream ps = new PrintStream(
                new FileOutputStream("src/dir/b.txt"));

        //2.拷贝
        String line = null;
        while((line = br.readLine()) != null) {
            if(br.ready())
                ps.println(line);
            else
                ps.print(line);
        }
        System.out.println("拷贝完成");

        //3.关闭资源
        ps.close();
        br.close();
    }
}
