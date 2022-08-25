package com.askelladd.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/8/24 19:16
 * @PackageName:com.askelladd.IO
 * @ClassName: FileInputStreamDemo
 * @Description: TODO
 * @Version 1.0
 */
public class FileInputStreamDemo {

    public static void main(String[] args) throws IOException {
        // 创建流对象
        FileInputStream inputStream = new FileInputStream("E:\\temp\\temp1\\1.txt");
        // 读数据
        char read = (char)inputStream.read();
        System.out.println(read);

        // 一个一个字节读取 while
        int temp;
        while ((temp = inputStream.read()) != -1){
            System.out.println((char) temp);
        }

        // 字符数组读取
        byte[] array = new byte[2];
        int len;

        while((len = inputStream.read(array)) != -1){
            System.out.println(new String(array,0,len));
        }


        inputStream.close();
    }
}
