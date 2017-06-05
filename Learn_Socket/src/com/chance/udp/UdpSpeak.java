package com.chance.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * 编写一个聊天应用程序 有收数据和发数据的部分，所以用到多线程的技术，一个接一个发 收和发的动作不一致，所以有两个Runnable
 *
 * @author LGL
 *
 */
public class UdpSpeak {

    public static void main(String[] args) {

        try {
            DatagramSocket sendSocket = new DatagramSocket();
            DatagramSocket receSocket = new DatagramSocket(10000);

            new Thread(new send(sendSocket)).start();
            new Thread(new rece(receSocket)).start();

        } catch (SocketException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

/**
 * 发送
 *
 * @author LGL
 *
 */
class send implements Runnable {

    private DatagramSocket socket;

    public send(DatagramSocket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader bufr = new BufferedReader(new InputStreamReader(
                    System.in));
            String line = null;
            while ((line = bufr.readLine()) != null) {
                if ("close".equals(line)) {
                    break;
                }
                byte[] buf = line.getBytes();
                DatagramPacket dp = new DatagramPacket(buf, buf.length,
                        InetAddress.getByName("192.168.1.102"), 10000);
                socket.send(dp);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}

/**
 * 接收
 *
 * @author LGL
 *
 */
class rece implements Runnable {

    private DatagramSocket socket;

    public rece(DatagramSocket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        while (true) {
            try {
                byte[] buf = new byte[1024];
                DatagramPacket dp = new DatagramPacket(buf, buf.length);
                socket.receive(dp);

                String ip = dp.getAddress().getHostAddress();
                String data = new String(dp.getData(), 0, dp.getLength());
                int port = dp.getPort();
                System.out.println(ip + "：" + data + ":" + port);

            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}