package com.askelladd.ThreadDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * class description:
 *
 * @Author ludong
 * @Date 2022/8/24 23:47
 * @PackageName:com.askelladd.ThreadDemo
 * @ClassName: ThreadSafe
 * @Description: TODO
 * @Version 1.0
 */
public class ThreadSafe {
    public static void main(String[] args) throws InterruptedException {
        Ticket3 ticket = new Ticket3();
        Thread thread = new Thread(ticket);
        Thread thread2 = new Thread(ticket);

        thread.start();
        thread2.start();
    }
}

class Ticket implements Runnable{

    private Integer restNum = 100;

    @Override
    public void run() {

   while(true){
       synchronized (Ticket.class){    // 字节码对象唯一  ; 指定为锁对象
           if(restNum>0){

               try {
                   Thread.sleep(10);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }

               System.out.println("sold the ticket"+restNum--);
           }

       }
   }

    }
}


class Ticket2 implements Runnable{
    private Integer rest = 100;
    private static Integer rest2 = 100;


    @Override
    public void run() {

        while(true){

            if(rest>0){

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                sellTicket();
            }

        }
    }

    public synchronized void sellTicket(){      // lock = this
        System.out.println("sold ticket: "+rest--);
    }

    public synchronized static void sellTicket2(){  // lock = Ticket2.class
        System.out.println("sold ticket: "+rest2--);
    }
}

class Ticket3 implements Runnable{
    private Integer rest = 100;
    Lock lock = new ReentrantLock();


    @Override
    public void run() {

        while(true){
            lock.lock();
            if(rest>0){

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                sellTicket();
            }
            lock.unlock();
        }
    }

    public void sellTicket(){      // lock = this
        System.out.println("sold ticket: "+rest--);
    }


}