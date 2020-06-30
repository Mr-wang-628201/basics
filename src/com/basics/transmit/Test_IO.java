package com.basics.transmit;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/25
 * Time : 12:23
 * Description :
 */
public class Test_IO {
    public static void main(String[] args) throws IOException {
        Test_OutputStream.Output();//文件输出流
        Test_InputStream.Input();//文件输入流
    }
}
class Test_OutputStream{
    public static void Output() throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt");
        byte[] b = {97,98,99,100,101};
        for (int i = 0; i < b.length; i++) {
            fos.write(b[i]);
            //fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
class Test_InputStream{
    public static void Input() throws IOException {
        FileInputStream fis = new FileInputStream("fos.txt");
        int i ;
        byte[] b = new byte[2];
        while ((i=fis.read(b))!=-1){
            System.out.println(new String(b,0,i));
        }
        fis.close();
    }
}
class Copy{
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\wanglin\\Pictures\\FLAMING MOUNTAIN.JPG");
        FileOutputStream fos = new FileOutputStream("copy.JPG");
        byte[] bytes = new byte[1024];
        int len;
        while ((len=fis.read(bytes))!=-1){
            //fos.write(bytes);
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
    }
}
class ProDome{
    public static void main(String[] args) {
        Properties pro = new Properties();
        pro.setProperty("filename","a.txt");
        pro.setProperty("length","209385038");
        pro.setProperty("location","D:\\a.txt");
        System.out.println(pro);
        System.out.println(pro.getProperty("filename"));
        System.out.println(pro.getProperty("length"));
        System.out.println(pro.getProperty("location"));
    }
}