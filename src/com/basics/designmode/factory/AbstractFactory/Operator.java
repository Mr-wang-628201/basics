package com.basics.designmode.factory.AbstractFactory;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/26
 * Time : 2:48
 * Description :
 */
public class Operator {
    public static void main(String[] args) {
        /**
         * 一个写入文件的抽象工厂（一个财务办的工厂，一个标准版的工厂）
         * 一个定义文件类型的接口（一个 PDF 文件，一个 HTML 文件）
         */
        String text = "HTML";
        ExportFactory factory = new ExportFinancialFactory();
        factory.getFile(text);
    }
}
