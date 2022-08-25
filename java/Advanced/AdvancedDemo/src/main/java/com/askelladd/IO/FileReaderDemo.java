package com.askelladd.IO;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/8/24 19:30
 * @PackageName:com.askelladd.IO
 * @ClassName: FileReaderDemo
 * @Description: TODO
 * @Version 1.0
 */
public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("./1.txt");

        int len;
        char[] buffer = new char[2];
        while((len = fileReader.read(buffer))!=-1){
            System.out.println(new String(buffer,0,len));
        }

        fileReader.close();
    }
}
