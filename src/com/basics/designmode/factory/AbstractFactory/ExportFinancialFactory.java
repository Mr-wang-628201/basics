package com.basics.designmode.factory.AbstractFactory;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/26
 * Time : 3:25
 * Description :
 */
public class ExportFinancialFactory implements ExportFactory {
    private ExportFile file;
    @Override
    public ExportFile getFile(String text) {
//        if (text.isEmpty()){
//            return null;
//        }
        if ("HTML".equals(text)){
            file = new ExportFinancialHTMLFile();
        }else if("PDF".equals(text)){
            file = new ExportFinancialPDFFile();
        }else {
            System.out.println("你输入的文件格式不正确。。。");
        }
        file.export(text);
        return file;
    }
}
