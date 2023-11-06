package com.briup.day20;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/*
    创建一个TCP客户端，从键盘录入数据，发送给服务器
    当录入quit时，结束录入，客户端关闭
 */
public class Test02_多线程客户端 {
    public static void main(String[] args) throws Exception {
        //1.搭建客户端
        Socket socket = new Socket("127.0.0.1",9999);
        System.out.println("客户端连接成功: " + socket);

        //2.获取IO流
        PrintStream ps = new PrintStream(socket.getOutputStream());

        //3.从键盘录入字符串，然后发给到服务器
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("input msg: ");
            String line = sc.nextLine();
            ps.println(line);

            //判断是否为quit，如果是 则退出
            if("quit".equals(line))
                break;
        }

        //4.关闭流及客户端
        ps.close();
        socket.close();
    }
}
