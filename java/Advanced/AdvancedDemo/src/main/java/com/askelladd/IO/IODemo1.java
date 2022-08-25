package com.askelladd.IO;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/8/24 17:46
 * @PackageName:com.askelladd.IO
 * @ClassName: IODemo1
 * @Description: TODO
 * @Version 1.0
 */
public class IODemo1 {

    public static void main(String[] args) throws IOException {
        // iterate all file
        printDir(new File("E:\\dir1"));

    }

    public static void printDir(File dir){
        if(dir.isFile()){
            System.out.println(dir);
        }else{
            File[] files = dir.listFiles();
            for (File ite:files){
                if(dir.isFile()) System.out.println(ite);
                else if(dir.isDirectory())  printDir(ite);
            }

        }
    }

    public static void createFile() throws IOException {
        File file = new File("./1.txt");
        if(!file.exists()){
            file.createNewFile();
        }
    }

    public static void createDirectory(){
        File path = new File("E:\\dir1");
        File path2 = new File("E:\\dir2\\dir3");
        // 创建目录
        if(!path.exists()){
            path.mkdir();
        }
        else{
            path.delete();
        }
        // 创建多级目录
        if(path2.exists()){
            path2.mkdirs();
        }
    }

    public static void getFileInfoList(){
        File path = new File("E:\\dir1");

        String[] list = path.list();
        System.out.println(Arrays.toString(list));

        File[] files = path.listFiles();
        System.out.println(Arrays.toString(files));
    }


}
