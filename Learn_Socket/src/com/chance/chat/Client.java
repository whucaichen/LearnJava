package com.chance.chat;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;
/**
 * 本程序实现了一个TCP程序的客户端编程部分。
 * 使用Socket套接字进行编程，完成的是基于TCP可靠服务实现与服务器的双通信。
 * 服务器的编程见本包中的类Server
 * 可以在不同的平台与不同的机器上运行，只是要把代码中写的IP地址修改为运行服务器程序Server的机器的IP地址。
 * @author HAN
 *
 */
@SuppressWarnings("serial")
public class Client extends JDialog{
    private BufferedReader reader;
    private PrintWriter writer;
    private Socket socket;
    private JTextArea ta=new JTextArea();
    private JScrollPane sp=new JScrollPane(ta);
    private JTextField tf=new JTextField();
    Container cc;
    public Client(String title) {
        setTitle(title);
        setSize(300,400);
//        setVisible(true);
        setResizable(false);

        addWindowListener(new WindowAdapter() {
            public void windowClosing (WindowEvent we) {
                dispose();  //撤销dialog一切相关资源
                System.exit(0); //正常退出程序
            }
        });
        cc=getContentPane();
        setLayout(null);
        ta.setLineWrap(true);
        ta.setEditable(false);
        sp.setBounds(0,0,300,342);
        tf.setBounds(0,342,300,25);
        cc.add(sp);
        cc.add(tf);
        tf.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                writer.println(tf.getText());
                ta.append("User2："+tf.getText()+'\n');
                tf.setText("");
            }
        });
    }
    private void connect(){
        ta.append("尝试连接\n");
        try {
            socket=new Socket("localhost",8998);
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            writer=new PrintWriter(socket.getOutputStream(),true);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        ta.append("完成连接\n");
    }

    private void getClientMessage(){
        try {
            reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while(true){
                String news=reader.readLine();
                if(news!=null){
                    ta.append("User1："+news+"\n");
                }else{
                    ta.append("User1（服务器） 已断开链接，等待服务器重连之时，重启User2（客户端）进行通信\n");
                    break;
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            ta.append("User1（服务器） 已断开链接，等待服务器重连之时，重启User2（客户端）进行通信\n");
            e.printStackTrace();
        }
        try{
            if(reader!=null){
                reader.close();
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if(socket!=null){
            try {
                socket.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Client user2=new Client("User2");
//        user2.setBounds(0,0,300,400);
        user2.setVisible(true);
//        user2.setResizable(false);
        user2.connect();
        user2.getClientMessage();
    }
}