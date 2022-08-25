package com.askelladd.ThreadDemo;

import java.util.concurrent.*;

public class PoolDemo {
    public static void main(String[] args) {

        // 线程池
        ExecutorService pool = Executors.newFixedThreadPool(3);

        HandleCallable1 t1 = new HandleCallable1("t1");
        HandleCallable1 t2 = new HandleCallable1("t2");
        HandleCallable1 t3 = new HandleCallable1("t3");

        // 提交任务
        Future<Integer> result1 = pool.submit(t1);
        Future<Integer> result2= pool.submit(t2);
        Future<Integer> result3= pool.submit(t3);

        // 关闭线程池
        pool.shutdown();

        // 将 结果打印一下

        try {
            System.out.println(result1.get());
            System.out.println(result2.get());
            System.out.println(result3.get());
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}

class HandleCallable1 implements Callable<Integer>{
    private String name;

    public HandleCallable1(String name){
        this.name = name;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println(this.name+"开始计算");

        Thread.sleep(200);

        int sum=0;

        Integer temp = (int)(Math.random()*100);
        System.out.println("produce: "+temp);
        for (int i=0;i<temp;i++){
            sum+=i;
        }

        return sum;
    }
}