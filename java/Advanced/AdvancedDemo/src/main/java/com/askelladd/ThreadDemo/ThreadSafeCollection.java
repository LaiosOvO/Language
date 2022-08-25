package com.askelladd.ThreadDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSafeCollection {

    public static void main(String[] args) {
        SafeArrayList();
        UnSafeArrayList();
    }

    public static void SafeArrayList(){
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        ExecutorService pool = Executors.newFixedThreadPool(5);

        for(int i=0;i<5;i++){
            pool.submit(new Runnable() {
                @Override
                public void run() {

                    for (int j=0;j<10;j++){
                        list.add("content: "+new Random().nextInt(100));
                    }

                }
            });

        }

        pool.shutdown();
        while(!pool.isTerminated()){}

        System.out.println("现在集合的个数  "+list.size());
        for (String ite:list){
            System.out.println(ite);
        }

    }

    public static void UnSafeArrayList(){

        List<String> list = new ArrayList<>();

        ExecutorService pool = Executors.newFixedThreadPool(5);

        for(int i=0;i<5;i++){
            pool.submit(new Runnable() {
                @Override
                public void run() {

                    for (int j=0;j<10;j++){
                        list.add("content: "+new Random().nextInt(100));
                    }

                }
            });

        }

        pool.shutdown();
        while(!pool.isTerminated()){}

        System.out.println("现在集合的个数  "+list.size());
        for (String ite:list){
            System.out.println(ite);
        }

    }
}
