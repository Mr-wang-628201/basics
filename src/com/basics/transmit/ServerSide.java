package com.basics.transmit;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/24
 * Time : 20:12
 * Description :
 */
public class ServerSide {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器启动。。。");
        ServerSocket serverSocket = new ServerSocket(6666);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        byte[] b = new byte[1024];
        int read = inputStream.read(b);
        String str = new String(b, 0, read);
        System.out.println(str);

        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("服务器收到了来自客户端的消息。。。".getBytes());

        inputStream.close();
        accept.close();
        serverSocket.close();

    }
}
