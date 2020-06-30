package com.basics.designmode.factory.AbstractFactory;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/26
 * Time : 3:13
 * Description :
 */
public class ExportStandardPDFFile implements ExportFile {
    @Override
    public ExportFile export(String text) {
        if (text.isEmpty()){
            return null;
        }
        System.out.println("导出标准版的PDF文件。。。");
        return new ExportStandardPDFFile();
    }
}
