package com.briup.day18;

import java.io.*;

public class Test06_缓冲字符流 {
    public static void main(String[] args) throws Exception {
        //1.创建流对象
        FileReader fr = new FileReader("src/dir/a.txt");
        BufferedReader br = new BufferedReader(fr);

        BufferedWriter bw = new BufferedWriter(
                new FileWriter("src/dir/b.txt"));

        //2.小数组拷贝
//        int len = -1;
//        char[] buff = new char[1024];
//        while((len = br.read(buff)) != -1) {
//            bw.write(buff,0,len);
//        }

        //逐行拷贝
        String line = null;
        // 一次读取一行数据，如果读取到文件末尾，返回null
        // 注意：readLine() 无法读取到 换行符
        while((line = br.readLine()) != null) {
            bw.write(line);
            //额外写一个换行符
            //bw.write("/r/n");

            //判断是否读取到文件末尾
            if(br.ready())
                bw.newLine();
        }

        System.out.println("拷贝完成!");

        //3.关闭资源
        bw.close();
        br.close();
    }

}
