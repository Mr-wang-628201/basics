package com.basics.designmode.singleton;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/25
 * Time : 12:13
 * Description : 在饥汉式中不需要考虑线程安全问题，在JVM中已经通过 CAS 算法解决了线程不安全问题。
 */
public class LazyType {
    private static volatile LazyType lt = new LazyType();

    private LazyType() {
    }

    public static LazyType getInstance(){
        return lt;
    }
}
