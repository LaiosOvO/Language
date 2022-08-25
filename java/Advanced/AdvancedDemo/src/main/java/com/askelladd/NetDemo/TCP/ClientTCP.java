package com.askelladd.NetDemo.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTCP {
    public static void main(String[] args) throws IOException {
        // 创建Socket,连接服务端
        Socket client = new Socket("localhost", 8786);

        // 创建输出流
        OutputStream outputStream = client.getOutputStream();

        // 通过输出流,输出响应的数据
        outputStream.write("你好服务器".getBytes());

        // 通过输入流    获取服务器的数据
        InputStream inputStream = client.getInputStream();
        byte[] buffer = new byte[1024];
        int len = inputStream.read(buffer);
        System.out.println(new String(buffer,0,len));

        // 关闭相关资源
        outputStream.close();
        client.close();
    }
}
