package com.askelladd.IO;

import java.io.*;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/8/24 20:51
 * @PackageName:com.askelladd.IO
 * @ClassName: TransferIO
 * @Description: TODO
 * @Version 1.0
 */
public class TransferIO {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("1.txt"), "UTF-8");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("./11.txt"), "UTF-8");
    }
}
