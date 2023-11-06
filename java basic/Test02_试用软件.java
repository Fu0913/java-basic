package com.briup.day19;

import java.io.*;

/*
编程实现：如果现在有一款只能试用10次的软件，试用10次后，再运行软件，软件会提醒用户购买正版。
实现思路：程序运行读取文件内容num(10次)，输出试用次数，然后num--,最后再把num写回文件
 */
public class Test02_试用软件 {

    public static void main(String[] args) throws Exception {
        //1.读取num.txt文件内容
        DataInputStream dis = new DataInputStream(
                new FileInputStream("src/dir/num.txt"));
        //获取试用次数
        int num = dis.readInt();
        System.out.println("欢迎使用，您的剩余试用次数: " + num);

        //流使用完，及时关闭
        dis.close();

        if(num == 0) {
            System.out.println("请购买正版!");
            //程序返回
            return;
        }

        //试用次数减1
        num--;

        //将num再写回num.txt中
        DataOutputStream dos = new DataOutputStream(
                new FileOutputStream("src/dir/num.txt"));
        dos.writeInt(num);
        dos.close();
    }

    //准备文件，存储最初试用次数 10
    public static void main01(String[] args) throws Exception {
        //1.实例化数据流
        DataOutputStream dos = new DataOutputStream(
                new FileOutputStream("src/dir/num.txt"));

        //2.将int类型10 写入到 指定文件
        dos.writeInt(10);          //4
        System.out.println("写入10完成");

        //3.关闭资源
        dos.close();
    }
}
