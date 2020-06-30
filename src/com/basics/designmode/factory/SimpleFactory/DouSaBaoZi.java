package com.basics.designmode.factory.SimpleFactory;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/25
 * Time : 22:45
 * Description : 豆沙包类
 */
public class DouSaBaoZi implements BaoZi {
    @Override
    public void pi() {
        System.out.println("豆沙包的皮。。。");
    }

    @Override
    public void xian() {
        System.out.println("豆沙包的馅。。。");
    }

    @Override
    public void xingzhuang() {
        System.out.println("豆沙包的形状是圆的");
    }
}
