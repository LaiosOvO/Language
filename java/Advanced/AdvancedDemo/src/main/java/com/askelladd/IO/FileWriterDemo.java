package com.askelladd.IO;

import java.io.FileWriter;
import java.io.IOException;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/8/24 19:30
 * @PackageName:com.askelladd.IO
 * @ClassName: FileWriterDemo
 * @Description: TODO
 * @Version 1.0
 */
public class FileWriterDemo {

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("./5.txt");

        fileWriter.write('h');
        fileWriter.write('e');

        char[] temp = "llo".toCharArray();
        fileWriter.write(temp);

        fileWriter.write(" world");

        fileWriter.close();
    }
}
