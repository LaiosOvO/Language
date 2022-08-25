package com.askelladd.BasicPackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/8/24 1:10
 * @PackageName:com.askelladd.BasicPackage
 * @ClassName: DateDemo
 * @Description: TODO
 * @Version 1.0
 */
public class DateDemo {
    public static void main(String[] args) throws ParseException {
        method1();

    }


    public static void method1() throws ParseException {
        // Date
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);

        // Calendar
        Calendar now = Calendar.getInstance();
        System.out.println(now.get(Calendar.YEAR));


        // Calendar ==> Date
        // String --> Date
        Date dateTime = now.getTime();
        String str = "2022-8-24 10:03:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


        Date parse = sdf.parse(str);
        System.out.println(parse);

        // Date --> String
        String format = sdf.format(dateTime);
        System.out.println(format);
    }


}
