package com.askelladd.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/8/24 19:26
 * @PackageName:com.askelladd.IO
 * @ClassName: CopyPicture
 * @Description: TODO
 * @Version 1.0
 */
public class CopyPicture {

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("./1.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("./2.jpg");

        byte[] buffer = new byte[1024];
        int len;
        while((len = inputStream.read(buffer))!=-1){
            fileOutputStream.write(buffer,0,len);
        }

        inputStream.close();
        fileOutputStream.close();
    }
}
