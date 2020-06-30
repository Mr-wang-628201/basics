package com.basics.designmode.factory.SimpleFactory;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/26
 * Time : 0:47
 * Description : 客户类提需求，工厂类创建包子
 */
public class Client {
    public static void main(String[] args) {
        String baoZi = Species.DOUSA;
        CreateBaoZi.getBaoZi(baoZi);
    }
}
