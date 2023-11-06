package com.briup.io.day03;

import java.io.*;

public class Test0210_DataStream {
    public static void main(String[] args) throws IOException {
        // 数据输出流
        // 声明流、创建流
        FileOutputStream fos = new FileOutputStream("src/dir/data.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        // 使用流
        dos.writeBoolean(true);
        dos.writeDouble(20.8D);
        dos.writeInt(100);
        dos.write("abc".getBytes());

        // 关闭流
        dos.close();

        // 数据输入流
        FileInputStream fis = new FileInputStream("src/dir/data.txt");
        DataInputStream dis = new DataInputStream(fis);

        // 读取顺序和写入的顺序必须保持一致
        boolean b = dis.readBoolean();
        System.out.println("b = " + b);
        double v = dis.readDouble();
        System.out.println("v = " + v);
        int i = dis.readInt();
        System.out.println("i = " + i);
        String s = dis.readLine();
        System.out.println("s = " + s);

        dis.close();
    }
}
