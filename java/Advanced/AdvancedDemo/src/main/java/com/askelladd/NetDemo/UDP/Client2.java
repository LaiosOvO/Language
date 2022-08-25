package com.askelladd.NetDemo.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Client2 {
    public static void main(String[] args) throws IOException {
        // 1
        DatagramSocket receiveSocket = new DatagramSocket(7894);
        // 2 接受数据
        byte[] data = new byte[1024];
        // 3 创建了    数据报 包
        DatagramPacket packet = new DatagramPacket(data, data.length);
        // 4 接受数据
        receiveSocket.receive(packet);
        System.out.println(new String(data,0,packet.getLength()));





        // 指定端口和IP地址
        int port = 7894;
        InetAddress localhost = InetAddress.getByName("localhost");

        byte[] data2 = "hello,UDP".getBytes();
        // 创建数据包
        DatagramPacket packet2 = new DatagramPacket(data2, data2.length, localhost, port);
        // 发送数据
        receiveSocket.send(packet);


        // 关闭资源
        receiveSocket.close();
    }
}
