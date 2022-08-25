package com.askelladd.BasicPackage;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/8/23 17:52
 * @PackageName:com.askelladd.BasicPackage
 * @ClassName: StringPractice
 * @Description: TODO
 * @Version 1.0
 */
public class StringPractice {

    public static void main(String[] args) {
//        BasicApi();
        VariableStirng();
    }


    public static void ConstructStringMethod(){
        // String类的三种构造函数 【char[];byte[]; 构造函数 】
        //  1.1
        String str1 = "123";

        // 1.2
        char[] data1 = {'a','b','c'};
        String str2 = new String(data1);

        // 1.3
        byte[] data = {97,98,99};
        String str3 = new String(data);
    }

    public static void BasicApi(){
        String target = "123456";

        // charAt(Integer index)
        char c = target.charAt(1);

        // contains(String targer)
        boolean contains = target.contains("23");
        System.out.println(contains);

        // endsWith(String suffix)
        boolean b = target.endsWith("56");
        System.out.println(b);

        // startsWith(String prefix)
        boolean b1 = target.startsWith("12");
        System.out.println(b1);

        // equals(String target)
        boolean equals = target.equals("123");
        System.out.println(equals);

        /*
        *   String == > char[]
        *   String ==> byte[]
        * */
        byte[] bytes = target.getBytes(StandardCharsets.UTF_8);
        System.out.println(bytes);

        char[] chars = target.toCharArray();
        System.out.println(chars);

        /*
        *   搜索
        *   indexOf(int ch)
        *   indexOf(int ch,int fromIndex)
        *   lastIndexOf(String str)
        *   lastIndexOf(String str,int fromIndex)
        *
        *   区别:
        *       indexOf()       从左边开始搜索
        *       lastIndexOf()   从右边开始搜索
        * */
        int i = target.indexOf("12");
        System.out.println(i);
        int i1 = target.lastIndexOf("12");
        System.out.println(i1);


        /*
        *   isEmpty()
        *   返回true , 如果且仅当  length() 为0
        * */
        String temp1 = "";
        System.out.println(temp1.isEmpty());

        /*
        *   replace(char oldChar,char newChar)
        * */
        String temp2 = "123abc456";
        temp2.replace("123","!!!");
        System.out.println(temp2);

        /*
        *   String[] splite(String regex)
        * */
        String temp3 = "1,2,3,4,5,6";
        String[] split = temp3.split(",");
        System.out.println(split);

        /*
        *   subString()
        * */
        String temp4 = "123123123123";
        String substring = temp4.substring(3);
        System.out.println(substring);

        /*
        * toLowerCase()
        * toUpperCase()
        * */
        String temp5 = "aaaaaa";
        String s = temp5.toUpperCase(Locale.ROOT);
        System.out.println(s);
        String s1 = s.toLowerCase(Locale.ROOT);
        System.out.println(s1);

        /*
        *   trim()
        * */
        String temp6 = "  123  456   ";
        System.out.println(temp6.trim());
    }

    public static void VariableStirng(){
        /*
        *   append()
        *   insert()
        *   delete()
        *   replace()
        *   length()
        * */
        StringBuffer temp1 = new StringBuffer();
        StringBuffer append = temp1.append("111").append("222").append("333");
        System.out.println(append);

        System.out.println(append.insert(2, "000000"));

        System.out.println(append.delete(0, 1));

        StringBuffer replace = append.replace(1, 3, "12");
        System.out.println(replace);

        System.out.println(replace.length());
    }

}
