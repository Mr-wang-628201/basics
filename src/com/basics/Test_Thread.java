package com.basics;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test_Thread {

    public static void main(String[] args) {
        MyThread mt = new MyThread("小强");
        mt.start();
        for (int i = 0;i<20;i++){
            System.out.println("小明"+i);
        }
    }
}
class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }
    public void run(){
        for(int i = 0 ; i<20 ;i++){
            System.out.println(getName()+i);
        }
    }
}
class Test_Runnable{
    public static void main(String[] args) {

        MyRunnable mr = new MyRunnable();
        Thread thread = new Thread(mr,"小强");
        thread.start();
        for(int i = 0 ; i <20 ;i++){
            System.out.println("小明"+i);
        }

        Runnable rb = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+i);
                }
            }
        };
        new Thread(rb,"张三").start();

    }
}
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i = 0 ; i <20 ;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }

    }
}
class Test_Ticket{
    public static void main(String[] args) {
        Ticket tk = new Ticket();
        //Ticket tk1 = new Ticket();
        ThreadPoolUtil.execte(tk);
        //ThreadPoolUtil.execte(tk);


        System.out.println("当前活跃的线程数："+ThreadPoolUtil.getActiveCount());


    }
}
class Ticket implements Runnable{
    int ticket =100;
    //Object lock = new Object();
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            lock.lock();
            //synchronized (lock){
                if (ticket>0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"正在买票，票号是："+ticket--);
                }
            //}
            lock.unlock();
        }
    }
}