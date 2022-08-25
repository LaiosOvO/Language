package com.askelladd.IO;

import java.io.*;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/8/24 20:32
 * @PackageName:com.askelladd.IO
 * @ClassName: BufferByte
 * @Description: TODO
 * @Version 1.0
 */
public class BufferByte {
    public static void main(String[] args) throws IOException {

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("1.jpg"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("3.jpg"));

        int len;
        byte[] bytes = new byte[1024];
        while((len = bufferedInputStream.read(bytes))!=-1){
            bufferedOutputStream.write(bytes);
        }

        bufferedInputStream.close();
        bufferedOutputStream.close();

    }


}
