package com.briup.day18;

import java.io.*;

/*
    读取File_GBK.txt文件中内容，按照UTF-8编码格式，
    写入到另一个文件File_UTF8.txt
 */
public class Test10_Utf8ToGbk {
    public static void main(String[] args) throws Exception {
        //1.实例化流对象
        FileInputStream fis =
                new FileInputStream("src/dir/File_GBK.txt");
        //  按照GBK编码去读取文件内容
        InputStreamReader isr =
                new InputStreamReader(fis,"GBK");
        // 进一步增强，提高性能
        BufferedReader br = new BufferedReader(isr);

        //准备 输出流
        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream("src/dir/File_UTF8.txt"),"UTF-8");
        BufferedWriter bw = new BufferedWriter(osw);

        //2.文件拷贝
        String line = null;
        while((line = br.readLine()) != null) {
            bw.write(line);

            if(br.ready())
                bw.newLine();
        }
        System.out.println("拷贝完成");

        //3.关闭流
        bw.close();
        br.close();
    }
}
