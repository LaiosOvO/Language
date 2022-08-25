package com.askelladd.IO;


import java.io.*;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/8/24 20:34
 * @PackageName:com.askelladd.IO
 * @ClassName: BufferChar
 * @Description: TODO
 * @Version 1.0
 */
public class BufferChar {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("./1.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./10.txt"));

        String temp = null;
        while((temp = bufferedReader.readLine())!=null){
            System.out.println(temp);
        }


        bufferedWriter.write("hello");
        bufferedWriter.newLine();
        bufferedWriter.write("world");

        bufferedReader.close();
        bufferedWriter.close();
    }

}
