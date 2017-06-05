package com.chance.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * 需求：接收指定端口发送过来的数据
 * 思路：
 * 1.定义socket服务
 * 2.定义数据包，存储接收到的字节数据，因为数据包对象中有更多功能可以提取字节数据中的不同数据信息
 * 3.通过socket的receive方法收到的数据存储到数据包中
 * 4.将这些不同的数据取出，打印
 * 5.关闭资源
 *
 * @author LGL
 *
 */
class UdpRece {
    public static void main(String[] args) {
        try {
            // 1.创建服务，建立端点
            DatagramSocket dSocket = new DatagramSocket(8080);
            // 2.定义数据包，存储数据
            byte[] buf = new byte[1024];
            DatagramPacket dp = new DatagramPacket(buf, buf.length);
            // 3.存储
            dSocket.receive(dp);
            // 4.获取其中的数据
            String ip = dp.getAddress().getHostAddress();
            String data = new String(dp.getData(), 0, dp.getLength());
            int port = dp.getPort();
            System.out.println(ip+"：" + data + ":" + port);
            //5.关闭资源
            dSocket.close();
        } catch (SocketException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}