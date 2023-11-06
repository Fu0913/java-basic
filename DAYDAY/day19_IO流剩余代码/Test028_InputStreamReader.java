package com.briup.io.day03;

import java.io.*;

/**
 * 使用转换流解决上述案例中的问题。
 */
public class Test028_InputStreamReader {
    public static void main(String[] args) throws IOException {
        // 声明流、创建流
        FileInputStream fis = new FileInputStream("/Users/chris_songjl/Desktop/test.txt");
        // 转化流
        InputStreamReader isr = new InputStreamReader(fis, "GB2312");

        int read;
        while ((read = isr.read()) != -1) {
            System.out.print((char)read);
        }
        isr.close();
    }
}
