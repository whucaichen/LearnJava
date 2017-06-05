package com.chance.mq;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;

/**
 * Created by Chance on 16/08/22.
 */
public class MyFrame extends JFrame {

    public JButton jbt_set = new JButton("设 置");
    public JButton jbt_connect = new JButton("连 接");
    public JButton jbt_browse = new JButton("浏 览");
    public JButton jbt_send = new JButton("发 送");
    public JButton jbt_discon = new JButton("断 开");
    public JButton jbt_history = new JButton("历 史");

    public JTextArea jta_recv = new JTextArea("消息接收区");
    public JTextArea jta_send = new JTextArea("示例报文");

    public MyFrame() throws HeadlessException {
        super("MQ消息模拟器");
        setSize(600, 800);
        setResizable(false);
        setLocationRelativeTo(null);    //居中显示
        URL url = this.getClass().getResource("img/zjft2_s.png");
        Image img = Toolkit.getDefaultToolkit().getImage(url);
        setIconImage(img);
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

        jta_recv.setEditable(false);
        jta_recv.setLineWrap(true); //激活自动换行功能
        jta_recv.setWrapStyleWord(true);    //激活断行不断字功能
        JScrollPane jsp_recv = new JScrollPane(jta_recv);
        jsp_recv.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_AS_NEEDED);
        jsp_recv.setPreferredSize(new Dimension(600, 600));
        this.add(jsp_recv);

        JPanel jpn_control = new JPanel();
        jpn_control.setLayout(new GridLayout(1, 6));
        jpn_control.add(jbt_set);
        jpn_control.add(jbt_connect);
        jpn_control.add(jbt_browse);
        jpn_control.add(jbt_send);
        jpn_control.add(jbt_discon);
        jpn_control.add(jbt_history);
        this.add(jpn_control);

        jta_send.setLineWrap(true);
        jta_send.setWrapStyleWord(true);
        JScrollPane jsp_send = new JScrollPane(jta_send);
        jsp_send.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_AS_NEEDED);
        jsp_send.setPreferredSize(new Dimension(600, 200));
        this.add(jsp_send);

//        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

}
