package com.askelladd.CollectionDemo;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/8/24 14:15
 * @PackageName:com.askelladd.CollectionDemo
 * @ClassName: Point
 * @Description: TODO
 * @Version 1.0
 */
public class Point <T>{
    private T x;
    private T y;

    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public void setX(T x) {
        this.x = x;
    }

    public void setY(T y) {
        this.y = y;
    }

    // 定义在方法上的泛型
    public static <T> void getValue(T m){
        System.out.println(m);
    }

}
