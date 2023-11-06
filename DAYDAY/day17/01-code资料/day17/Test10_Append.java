package com.briup.day17;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test10_Append {
    public static void main(String[] args) throws IOException {
        //1.关联流和文件
        FileOutputStream fos =
                new FileOutputStream("D:\\test\\a.txt",true);

        //2.从键盘录入字符串，追加到文件中
        Scanner sc = new Scanner(System.in);
        System.out.println("input a string: ");
        String line = sc.nextLine();

        //String --> byte[]
        byte[] bytes = line.getBytes();

        //写入流【自动实现追加】
        fos.write(bytes);
        System.out.println("追加成功!");

        //3.关闭流，释放资源
        fos.close();
    }
}
