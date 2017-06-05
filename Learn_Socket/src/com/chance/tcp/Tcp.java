package com.chance.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 客户端发送信息，服务端收到，反馈信息
 *
 * @author LGL
 */
public class Tcp {

    public static void createClient() {
        try {
            Socket s = new Socket("192.168.1.102", 10005);
            OutputStream out = s.getOutputStream();
            out.write("我是客户端".getBytes());
            InputStream in = s.getInputStream();
            byte[] buf = new byte[1024];
            int len = in.read(buf);
            System.out.println(new String(buf, 0, len));
            s.close();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * 服务端
     *
     * @author LGL
     */
    public static void createServer() {
        try {
            ServerSocket ss = new ServerSocket(10005);
            Socket s = ss.accept();
            InputStream in = s.getInputStream();
            byte[] buf = new byte[1024];
            int len = in.read(buf);
            System.out.println(new String(buf, 0, len));

            OutputStream out = s.getOutputStream();
            out.write("收到后反馈".getBytes());
            s.close();
            ss.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}