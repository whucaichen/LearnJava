package com.chance.udp;

import java.io.IOException;
import java.net.*;

/**
 * 需求： 通过UDP传输方式将一段文字数据发送出去
 * 思路：
 * 1.建立UDP的socket服务
 * 2.建立数据包
 * 3.发送数据
 * 4.关闭资源
 *
 * @author LGL
 *
 */
public class UdpSend {
    public static void main(String[] args) {
        try {
            // 1.建立UDP的socket服务,通过DatagramSocket对象
            DatagramSocket dSocket = new DatagramSocket();
            // 2.确定数据，封装成数据包
            byte[] data = "udp".getBytes();
            DatagramPacket dp = new DatagramPacket(data, data.length,
                    InetAddress.getByName("192.168.1.102"), 8080);
            // 3.发送数据
            dSocket.send(dp);
            // 4.关闭资源
            dSocket.close();
        } catch (SocketException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}