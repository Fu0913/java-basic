package com.briup.day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Test08_修改标准流 {
    public static void main(String[] args) throws Exception {
        //1.使用默认标准输入流 录入一行字符串
//        Scanner sc = new Scanner(System.in);
//        System.out.println("从键盘录入一行字符串: ");
//        String line = sc.nextLine();
//        System.out.println("read: " + line);
//
//        System.out.println("---------------");

        //2.修改标准输入流关联a.txt文件，然后从标准输入流中录入一行字符串
        InputStream is = new FileInputStream("src/dir/a.txt");
        System.setIn(is);
        Scanner sc = new Scanner(System.in);

        System.out.println("从键盘录入一行字符串: ");
        String line = sc.nextLine();
        System.out.println("read: " + line);
    }
}
