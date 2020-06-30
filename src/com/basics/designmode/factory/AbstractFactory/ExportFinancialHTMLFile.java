package com.basics.designmode.factory.AbstractFactory;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/26
 * Time : 3:14
 * Description :
 */
public class ExportFinancialHTMLFile implements ExportFile{
    @Override
    public ExportFile export(String text) {
        if (text.isEmpty()){
            return null;
        }
        System.out.println("导出金融版的HTML文件。。。");
        return new ExportFinancialHTMLFile();
    }
}
