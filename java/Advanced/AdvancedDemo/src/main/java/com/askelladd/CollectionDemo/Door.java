package com.askelladd.CollectionDemo;

import java.util.List;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/8/24 14:21
 * @PackageName:com.askelladd.CollectionDemo
 * @ClassName: Door
 * @Description: TODO
 * @Version 1.0
 */
public interface Door <T>{
    T getType();
}


class Person{}
class Student extends Person{}

class DoorImpl implements Door<String>{
    public String getType() {
        return "Hello";
    }

    // 定义在方法上的泛型
    public static <T> void getValue(T m){
        System.out.println(m);
    }

    // 方法 泛型 通配符
    public static void test1(List<?> list){

    }

    public static void test2(List<Object> list){}

    public static void test3(List<? extends Person> list){}

    public static void test4(List<? super Student> list){}
}
