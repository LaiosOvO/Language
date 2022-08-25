package com.askelladd.BasicPackage;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/8/23 17:44
 * @PackageName:com.askelladd.BasicPackage
 * @ClassName: Wrapper
 * @Description: TODO
 * @Version 1.0
 */
public class Wrapper {
    public static void main(String[] args) {
        // 装箱
        Integer integer = new Integer(10);
        Integer integer1 = Integer.valueOf(10);

        // 拆箱
        int i = integer.intValue();
        System.out.println(i);


        // 自动 【装箱 和 拆箱】
        Integer autoVari = 10;


        // 字符串与包装类型的转换
        //      基本类型 --> 字符串        字符串 --> 基本类型
        int tempValue = 10;
        String tempString = tempValue + "";

        int i1 = Integer.parseInt(tempString);
        System.out.println(i1);

    }


}
