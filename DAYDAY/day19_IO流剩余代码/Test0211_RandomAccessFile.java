package com.briup.io.day03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

/**
 * 将文件中的hello world123
 * 替换为hello briup123
 */
public class Test0211_RandomAccessFile {
    public static void main(String[] args) throws IOException {
        // 创建文件
        File file = new File("src/dir/a.txt");
        // 创建随机访问流对象，传入文件对象和工作模式
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        // 定义要替换的位置
        int replaceIndex = 6;
        // 跳转指定的索引位置
        raf.seek(replaceIndex);
        // 写入briup
        raf.write("briup".getBytes());
        System.out.println("替换成功");

        raf.seek(0);
        byte[] buf = new byte[10];
        int len = -1;
        while ((len = raf.read(buf)) != -1) {
            System.out.print(new String(buf, 0, len));
        }
        raf.close();
    }
}
