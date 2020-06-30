package com.basics.designmode.singleton;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/25
 * Time : 12:02
 * Description : 懒汉式下的单例模式，加了双重检查锁，实际开发中常用的单例模式。
 */
public class TheHungryType {;
    private static volatile TheHungryType tht = null ;
    private TheHungryType() {
    }
    public static TheHungryType getInstance(){
        if (tht == null){
            synchronized (TheHungryType.class){
                if(tht == null){
                    tht = new TheHungryType();
                }
            }
        }
        return tht;
    }
}
