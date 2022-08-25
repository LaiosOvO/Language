package com.askelladd.CollectionDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/8/24 14:32
 * @PackageName:com.askelladd.CollectionDemo
 * @ClassName: ListDemo
 * @Description: TODO
 * @Version 1.0
 */
public class ListDemo {

    public static void main(String[] args) {

    }

    public static void method1(){
        /*
        *   add()
        *   get()
        *   remove()
        *   set()
        * */
        List<Integer> list = new ArrayList<>();
        list.add(0,1);
        list.add(2);
        System.out.println(list);
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list);
        list.set(0,-1);
        System.out.println(list);

        System.out.println("=========================");

        LinkedList<Integer> integers = new LinkedList<>();

    }


}
