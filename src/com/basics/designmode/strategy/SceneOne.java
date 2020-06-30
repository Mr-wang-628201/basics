package com.basics.designmode.strategy;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/26
 * Time : 12:01
 * Description :
 */
public class SceneOne implements Strategy{
    @Override
    public void Operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力，使孙权不能杀刘备");
    }
}
