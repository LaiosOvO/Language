package com.askelladd.CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/8/24 12:38
 * @PackageName:com.askelladd.CollectionDemo
 * @ClassName: IteratorDemo
 * @Description: TODO
 * @Version 1.0
 */
public class IteratorDemo {
    public static void main(String[] args) {
        method1();
    }

    public static void method1(){
        Collection col = new ArrayList();

        col.add(1);
        col.add(2);
        col.add(3);


        // 遍历
        for (Object ite:col){
            System.out.println(ite);
        }

        Iterator iterator = col.iterator();

        while(iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
