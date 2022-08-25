package com.askelladd.CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/8/24 14:14
 * @PackageName:com.askelladd.CollectionDemo
 * @ClassName: GeneralCollectionDemo
 * @Description: TODO
 * @Version 1.0
 */
public class GeneralCollectionDemo {

    public static void main(String[] args) {
        method1();
    }

    public static void method1(){
        Collection col = new ArrayList();

        col.add(1);
        col.add(2);
        col.add(3);
        col.add(true);

        Integer sum=0;
        for (Object ite:col){
            if(ite instanceof Integer){
                Integer num = (Integer)ite;
                sum += num;
            }
        }

        System.out.println(sum);
    }

    public static void method2(){
        Point<Integer> p1 = new Point<Integer>(1,2);
    }


}
