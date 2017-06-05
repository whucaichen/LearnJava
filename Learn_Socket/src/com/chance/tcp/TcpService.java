package com.chance.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 定义端点接收数据打印出来
 * 服务端：
 * 1.建立服务端的socket服务，servicesocket,并监听一个端口
 * 2.获取连接过来的客户端对象，通过accept方法，这个方法是阻塞的，没有连接就会等
 * 3.客户端如果发过来数据，那么服务端要使用对应的客户端对象，并获取到该对象的读取流
 * 4.关闭服务端（可选操作）
 * @author LGL
 *
 */
public class TcpService {
    public static void main(String[] args) {
        try {
            //1.建立连接，监听端口
            ServerSocket ss = new ServerSocket(10000);
            //2.连接客户端对象
            Socket accept = ss.accept();
            //获取ip
            String ip = accept.getInetAddress().getHostAddress();
            //3.获取客户端发送过来的数据
            InputStream in = accept.getInputStream();
            //4.开始读取
            byte [] buf = new byte[1024];
            int len = in.read(buf);
            System.out.println(new String(buf,0,len));
            //5.关闭
            ss.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}