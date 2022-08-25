package com.askelladd.BasicPackage;

import java.math.BigDecimal;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/8/24 10:51
 * @PackageName:com.askelladd.BasicPackage
 * @ClassName: BigDecimalDemo
 * @Description: TODO
 * @Version 1.0
 */
public class BigDecimalDemo {


    public static void main(String[] args) {
        method1();
    }

    public static void method1(){
        //  对于精度要求很高 ==> BigDecimal
        BigDecimal b1 = new BigDecimal("1.01");
        BigDecimal b2 = new BigDecimal("0.072");

        System.out.println(b1.add(b2));
        System.out.println(b1.subtract(b2));

        System.out.println(b1.multiply(b2));
        System.out.println(b1.divide(b2, 2, BigDecimal.ROUND_FLOOR));
    }

}
