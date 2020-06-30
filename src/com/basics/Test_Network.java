package com.basics;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Test_Network {
    public static void main(String[] args) {
        System.out.println("网络编程");
    }
}
class FileUpload_Server{
    public static void main(String[] args) throws IOException {
        System.out.println("服务器启动。。。");
        ServerSocket server = new ServerSocket(6666);
        Socket accept = server.accept();
        BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Network.JPG"));
        Chuli.chuli(accept,bis,bos);
        bos.close();
        bis.close();
        accept.close();
        System.out.println("文件上传已保存");
    }
}
class FileUPload_Client{
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("copy.JPG"));
        Socket socket = new Socket("localhost", 6666);
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        Chuli.chuli(socket,bis,bos);
        bos.close();
        socket.close();
        bis.close();
        System.out.println("文件发送完毕");
    }
}
class Chuli{
    public static void chuli(Socket accept,BufferedInputStream bis,BufferedOutputStream bos) throws IOException {
        byte[] bytes = new byte[1024 * 8];
        int len;
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
    }
}