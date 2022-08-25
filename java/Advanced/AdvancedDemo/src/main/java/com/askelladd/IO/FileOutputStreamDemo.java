package com.askelladd.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/8/24 19:06
 * @PackageName:com.askelladd.IO
 * @ClassName: FileOutputStreamDemo
 * @Description: TODO
 * @Version 1.0
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        // 创建字符输出流
        FileOutputStream fos = null;

        try{
            fos = new FileOutputStream("E:\\temp\\temp1\\1.txt",true);
            fos.write(97);
            fos.write(98);
            fos.write(99);

            byte[] bytes = "hello".getBytes(StandardCharsets.UTF_8);
            fos.write(bytes);
        }finally {
            fos.close();
        }

    }

}
