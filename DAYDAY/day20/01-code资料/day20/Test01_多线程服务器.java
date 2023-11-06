package com.briup.day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
启动一个多线程服务器，同时接受客户端发送过来的信息，然后输出到控制台
 */
public class Test01_多线程服务器 {

    //使用匿名内部类对象(线程子类对象) 实现功能
    public static void main(String[] args) throws Exception {
        //1.搭建TCP服务器
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器启动成功: " + serverSocket);

        //2.接受客户端的连接
        while(true) {
            Socket socket = serverSocket.accept();
            System.out.println("新客户端连接成功: " + socket);

            //分离子线程 为 客户端提供服务
            Thread th = new Thread() {
                @Override
                public void run() {
                    BufferedReader br = null;
                    try {
                        //3.获取IO流
                        br = new BufferedReader(
                                new InputStreamReader(socket.getInputStream()));

                        //2.读取客户端发送的信息并输出
                        while(true) {
                            String line = br.readLine();
                            //获取socket另一端的 port和ip地址
                            int port = socket.getPort();
                            String ip = socket.getInetAddress().getHostAddress();
                            System.out.println(ip + ":" + port + ",read:  " + line);

                            //如果遇到quit则退出
                            if ("quit".equals(line))
                                break;
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        System.out.println("通信套接字资源即将释放...");
                        //关闭流 关闭客户端套接字
                        try {
                            if(br != null)
                                br.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        try {
                            if(socket != null)
                                socket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            };
            th.start();
        }
    }

    //使用自定义线程类 实现功能
    public static void main01(String[] args) throws Exception {
        //1.搭建TCP服务器
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器启动成功: " + serverSocket);

        //2.接受客户端的连接
        while(true) {
            Socket socket = serverSocket.accept();
            System.out.println("新客户端连接成功: " + socket);

            //分离子线程 为 客户端提供服务
            Thread th = new MyThread(socket);
            th.start();
        }
    }
}

//自定义线程类，专门为客户端提供服务
class MyThread extends Thread {
    private Socket socket;

    public MyThread() {}
    public MyThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        BufferedReader br = null;
        try {
            //1.获取通信IO流
            br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            //2.读取客户端发送的信息并输出
            while(true) {
                String line = br.readLine();
                //获取socket另一端的 port和ip地址
                int port = socket.getPort();
                String ip = socket.getInetAddress().getHostAddress();
                System.out.println("From " + ip + ":" + port + ",read:  " + line);

                //如果遇到quit则退出
                if("quit".equals(line))
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流 关闭客户端套接字
            try {
                if(br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if(socket != null)
                    socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}