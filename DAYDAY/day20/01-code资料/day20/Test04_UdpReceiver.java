package com.briup.day20;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
    Udp节点，接受数据
 */
public class Test04_UdpReceiver {
    public static void main(String[] args) {
        DatagramSocket socket = null;
        DatagramPacket packet = null;

        try {
            //1.实例化套接字
            socket = new DatagramSocket(9999);

            //2.准备数据包
            byte[] buf = new byte[1024];
            packet = new DatagramPacket(buf,0,buf.length);

            //3.接收发送端发送的数据
            socket.receive(packet);

            //4.从数据包中解析收取的数据
            //获取实际接收数据的个数
            int length = packet.getLength();
            String msg = new String(buf,0,length);
            InetAddress address = packet.getAddress();
            int port = packet.getPort();
            System.out.println("read: " + msg + " from: " + address.getHostAddress() + " " + port);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("资源即将释放");
            if(socket != null)
                socket.close();
        }


    }
}
