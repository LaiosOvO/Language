package com.askelladd.BasicPackage;

import java.util.Arrays;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/8/24 11:08
 * @PackageName:com.askelladd.BasicPackage
 * @ClassName: SystemDemo
 * @Description: TODO
 * @Version 1.0
 */
public class SystemDemo {

    public static void main(String[] args) {
        method1();
    }


    public static void method1(){
        int[] array = {1,2,3,4,55};
        int[] target = new int[5];


        System.arraycopy(array,0,target,0,5);
        System.out.println(Arrays.toString(target));

        System.out.println(System.currentTimeMillis());

        System.gc();

        System.exit(0);

        System.out.println("it is over");
    }
}
