package com.askelladd.ThreadDemo;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/8/25 0:33
 * @PackageName:com.askelladd.ThreadDemo
 * @ClassName: CoordinateThreadDemo
 * @Description: TODO
 * @Version 1.0
 */
public class CoordinateThreadDemo {
    public static void main(String[] args) {
        Object lock = new Object();

        new Thread(()->{
            synchronized (lock){
                System.out.println("1 告诉老板需要什么");
                try {
                    lock.wait(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("3 得到老板提供的物品;开始吃饭");
            }

        },"顾客").start();


        new Thread(()->{
            System.out.println("1 告诉老板需要什么");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (lock){
                System.out.println("2 提供顾客需要的物品");
                lock.notify();
            }

        },"老板").start();
    }


}


