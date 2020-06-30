package com.basics;


import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/22
 * Time : 12:37
 * Description :
 */
public class Test1 {
    public static ThreadLocal<String> t1 = new ThreadLocal<String>();
    public static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public static void main(String[] args) {
//        Runnable runnable = new Runnable() {
//            volatile int a = 0 ;
//            //Lock lock = new ReentrantLock();
//            @Override
//            public void run() {
//                System.out.println("这是一个 Runnable");
//                //lock.lock();
//                synchronized (Test1.class){
//                    for (int i = 0; i < 10; i++) {
//                        try {
//                            Thread.sleep(500);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        System.out.println(Thread.currentThread().getName()+" : "+(a++));
//                    }
//                }
//                //lock.unlock();
//            }
//
//        };
//        new Thread(runnable,"线程一").start();
//        new Thread(runnable,"线程二").start();
//        new Thread(runnable,"线程三").start();
//


    }
}
