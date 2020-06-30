package com.basics.transmit;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/24
 * Time : 20:11
 * Description :
 */
public class ClientSide {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端启动。。。");
        Socket socket = new Socket("127.0.0.1",8000);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("这是来自客户端的请求。。。".getBytes());

        InputStream inputStream = socket.getInputStream();
        byte[] b = new byte[1024];
        int read = inputStream.read(b);
        String str = new String(b, 0, read);
        System.out.println(str);

        outputStream.close();
        socket.close();
    }
}
