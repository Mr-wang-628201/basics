package com.basics.designmode.factory.AbstractFactory;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/26
 * Time : 3:15
 * Description :
 */
public class ExportStandardHTMLFile implements ExportFile{
    @Override
    public ExportFile export(String text) {
        if (text.isEmpty()){
            return null;
        }
        System.out.println("导出标准版的HTML文件。。。");
        return new ExportStandardHTMLFile();
    }
}
