package com.askelladd.NetDemo.UDP;

import java.io.IOException;
import java.net.*;

public class Client1 {
    public static void main(String[] args) throws IOException {
        // 发送数据
        System.out.println("Client 启动了");

        // 这个端口是用来接受数据的
        DatagramSocket sendSocket = new DatagramSocket(9999);
        // 指定端口和IP地址
        int port = 7894;
        InetAddress localhost = InetAddress.getByName("localhost");

        byte[] data = "hello,UDP".getBytes();
        // 创建数据包
        DatagramPacket packet = new DatagramPacket(data, data.length, localhost, port);
        // 发送数据
        sendSocket.send(packet);

        // 关闭资源
        sendSocket.close();
    }
}
