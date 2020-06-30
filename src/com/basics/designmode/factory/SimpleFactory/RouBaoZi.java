package com.basics.designmode.factory.SimpleFactory;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/26
 * Time : 0:34
 * Description : 肉包子类
 */
public class RouBaoZi implements BaoZi {
    @Override
    public void pi() {
        System.out.println("肉包子的皮。。。");
    }

    @Override
    public void xian() {
        System.out.println("肉包子的陷。。。");
    }

    @Override
    public void xingzhuang() {
        System.out.println("肉包子的形状是椭圆的。。。");
    }
}
