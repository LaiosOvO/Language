package com.askelladd.PropertiesDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/8/24 21:23
 * @PackageName:com.askelladd.PropertiesDemo
 * @ClassName: Demo1
 * @Description: TODO
 * @Version 1.0
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        method1();
    }

    public static void method1() throws IOException {
        Properties properties = new Properties();

        properties.setProperty("key1","value1");
        properties.setProperty("key2","value2");
        System.out.println(properties.getProperty("key1"));

        Set<String> set1 = properties.stringPropertyNames();
        for (String key:set1){
            System.out.println(key+"  "+properties.getProperty(key));
        }

        System.out.println("===================================================");


        properties.load(new FileInputStream("db.properties"));
        Set<String> set2 = properties.stringPropertyNames();
        for (String key:set2){
            System.out.println(key+"  "+properties.getProperty(key));
        }
    }
}
