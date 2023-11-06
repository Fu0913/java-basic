package com.briup.day20;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Test03_UdpSender {
    public static void main(String[] args) {
        DatagramSocket socket = null;
        DatagramPacket packet = null;

        try {
            //1.实例化套接字对象
            socket = new DatagramSocket();

            //2.实例化数据包 并填充数据
            byte[] buff = "hello world".getBytes();
            InetAddress addr = InetAddress.getByName("127.0.0.1");
            int port = 9999;
            packet = new DatagramPacket(buff,0,buff.length,addr,port);

            //3.直接发送数据包
            socket.send(packet);
            System.out.println("发送数据包成功!");
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("释放套接字资源");
            if(socket != null)
                socket.close();
        }
    }
}
