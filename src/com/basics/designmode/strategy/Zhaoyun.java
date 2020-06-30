package com.basics.designmode.strategy;

import java.io.*;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/26
 * Time : 11:53
 * Description :策略模式
 * 场景如下，刘备要到江东娶老婆了，走之前诸葛亮给赵云三个锦囊妙计，说是按天机拆开能解决棘手问题。
 * 场景中出现三个要素：三个妙计（具体策略类）、一个锦囊（环境类）、赵云（调用者）。
 * 场景一：找乔国老帮忙，让吴国太给孙权施加压力，使孙权不能杀刘备
 * 场景二：求吴国太开个绿灯，放行
 * 场景三：孙夫人断后，挡住追兵
 * 环境：context
 * 操作：operate
 *
 */
public class Zhaoyun {
    public static void main(String[] args) {

        Context context = new Context();
        System.out.println("------------------ 场景一 -----------------");
        context.setStrategy(new SceneOne());
        context.Operate();
        System.out.println("------------------ 场景二 -----------------");
        context.setStrategy(new SceneTwo());
        context.Operate();
        System.out.println("------------------ 场景三 -----------------");
        context.setStrategy(new SceneThree());
        context.Operate();
    }
}
