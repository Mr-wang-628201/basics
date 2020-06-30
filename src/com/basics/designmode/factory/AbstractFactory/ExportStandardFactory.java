package com.basics.designmode.factory.AbstractFactory;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/26
 * Time : 3:25
 * Description :
 */
public class ExportStandardFactory implements ExportFactory {
    private ExportFile file;
    @Override
    public ExportFile getFile(String text) {
        if (text.isEmpty()){
            return null;
        }
        if ("HTML".equals(text)){
            file = new ExportStandardHTMLFile();
        }else if("PDF".equals(text)){
            file = new ExportStandardPDFFile();
        }else {
            System.out.println("你输入的文件格式不正确。。。");
        }
        file.export(text);
        return file;
    }
}
