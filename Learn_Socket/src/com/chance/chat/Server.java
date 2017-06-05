package com.chance.chat;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.net.*;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 * 本程序实现了一个TCP程序的服务器编程部分。
 * 使用Socket套接字进行编程，完成的是基于TCP可靠服务实现与客户端的双通信。
 * 客户端的编程见本包中的类Client
 * @author HAN
 *
 */
@SuppressWarnings("serial")
public class Server extends JDialog{
    private BufferedReader reader;
    private PrintWriter writer;
    private ServerSocket server;
    private Socket socket;
    private JTextArea ta=new JTextArea();
    private JScrollPane sp=new JScrollPane(ta);
    private JTextField tf=new JTextField();
    Container cc;
    public Server(String title) {
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
                try {
                    writer=new PrintWriter(socket.getOutputStream(),true);
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                writer.println(tf.getText());
                ta.append("User1："+tf.getText()+'\n');
                tf.setText("");
            }
        });
    }
    void getserver(){
        try{
            server=new ServerSocket(8998);
            ta.append("服务器套接字已经创建成功\n");
            while(true){
                ta.append("等待客户机的连接\n");
                socket=server.accept();
                ta.append("客户机已连接\n");
                reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
                getClientMessage();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private void getClientMessage(){
        try {
            while(true){
                String news=reader.readLine();
                if(news!=null){
                    ta.append("User2："+news+"\n");
                }else{
                    ta.append("User2（客户端） 已断开链接\n");
                    break;
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
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
        Server user1=new Server("User1");
//        user1.setBounds(0,0,300,400);
//        user1.setResizable(false);
        user1.setVisible(true);
        user1.getserver();
    }
}
