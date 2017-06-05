package com.chance.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {

    public static void main(String[] args) {
        try {
            //1.创建客户端的服务，传地址和端口
            Socket s = new Socket("192.168.1.102",10000);
            //2.为了发送数据，应该获得socket流中的输出流
            OutputStream out = s.getOutputStream();
            out.write("你好".getBytes());
            s.close();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
