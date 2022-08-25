package com.askelladd.NetDemo.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP {
    public static void main(String[] args) throws IOException {
        // 创建服务器
        ServerSocket ss = new ServerSocket(8786);
        // 接受客户端的连接
        Socket accept = ss.accept();    // 简历连接之后,会发生阻塞,等待客户端的连接

        // 接受客户端    发送过来的数据
        InputStream inputStream = accept.getInputStream();

        // 通过输入流    接受客户端发送的数据
        byte[] buffer = new byte[1024];
        int len = inputStream.read(buffer);
        System.out.println(new String(buffer,0,len));

        // 服务器写出数据到客户端
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("你好客户端".getBytes());


        // 关闭资源
        inputStream.close();
        accept.close();
    }
}