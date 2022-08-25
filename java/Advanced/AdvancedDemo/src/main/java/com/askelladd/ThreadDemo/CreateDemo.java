package com.askelladd.ThreadDemo;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/8/24 21:36
 * @PackageName:com.askelladd.ThreadDemo
 * @ClassName: CreateDemo
 * @Description: TODO
 * @Version 1.0
 */
public class CreateDemo {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();

        for (int i=0;i<20;i++){
            System.out.println("th"+i);
        }

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

    }
}


class MyThread extends Thread{
    @Override
    public void run() {
        for (int i=0;i<20;i++){
            System.out.println("MyThread:         "+i);
        }
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<20;i++){
            System.out.println("MyThread2:         "+i);
        }
    }
}