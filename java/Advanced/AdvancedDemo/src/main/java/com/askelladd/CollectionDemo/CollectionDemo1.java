package com.askelladd.CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/8/24 12:26
 * @PackageName:com.askelladd.CollectionDemo
 * @ClassName: CollectionDemo1
 * @Description: TODO
 * @Version 1.0
 */
public class CollectionDemo1 {

    public static void main(String[] args) {
        method1();

    }

    public static void method1(){
        /*
        *   add()
        *   addAll()
        *   clear()
        *   equals()
        *   isEmpty()
        *   remove()
        *   size()
        *   toArray()
        * */
        Collection col = new ArrayList();
        Collection col2 = new ArrayList();
        Collection col3 = new ArrayList();

        col.add(1);
        col.add(2);
        col.add(3);
        col3.add(1);
        col3.add(2);
        col3.add(3);

        col2.add(true);
        col2.add("msg");
        col2.add(new Date());

        col.addAll(col2);
        System.out.println(col);

        col.clear();
        System.out.println(col);

        System.out.println(col.equals(col3));
        System.out.println(col.isEmpty());

        col2.remove(true);
        System.out.println(col2);

        System.out.println(col2.size());
    }



}
