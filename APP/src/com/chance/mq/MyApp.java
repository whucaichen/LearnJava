package com.chance.mq;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Chance on 16/08/23.
 */
public class MyApp implements ActionListener {

    public static void main(String[] args) {
        new MyApp();
    }

    public static String MQ_IP = "10.34.10.245";
    public static String MQ_QUEUE = "MQ_NAME";

    public static MyFrame myFrame;
    public static JFileChooser jfc_file = new JFileChooser();
    ;

    public MyApp() {
        myFrame = new MyFrame();
        myFrame.jbt_set.addActionListener(this);
        myFrame.jbt_connect.addActionListener(this);
        myFrame.jbt_browse.addActionListener(this);
        myFrame.jbt_send.addActionListener(this);
        myFrame.jbt_discon.addActionListener(this);
        myFrame.jbt_history.addActionListener(this);
//        myFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(myFrame.jbt_set.getActionCommand())) {
            //属性设置对话框
            final MyDialog myDialog = new MyDialog();
            myDialog.setJtf_ip(MQ_IP);
            myDialog.setJtf_queue(MQ_QUEUE);
            myDialog.jbt_confirm.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    MQ_IP = myDialog.getJtf_ip();
                    MQ_QUEUE = myDialog.getJtf_queue();
                    myDialog.dispose();
                }
            });
            myDialog.jbt_concel.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    myDialog.dispose();
                }
            });
            myDialog.setVisible(true);
        } else if (e.getActionCommand().equals(myFrame.jbt_connect.getActionCommand())) {
            //MQ连接
        } else if (e.getActionCommand().equals(myFrame.jbt_browse.getActionCommand())) {
            //MQ报文加载
            jfc_file.setDialogTitle("选择发送报文");
            chooseFile();
        } else if (e.getActionCommand().equals(myFrame.jbt_send.getActionCommand())) {
            //MQ报文发送
        } else if (e.getActionCommand().equals(myFrame.jbt_discon.getActionCommand())) {
            //MQ断开连接
        } else if (e.getActionCommand().equals(myFrame.jbt_history.getActionCommand())) {
            //MQ历史消息
            jfc_file.setDialogTitle("选择历史报文");
            chooseFile();
        } else {
            System.out.println("No ActionCommand Matched!");
        }
    }

    public static void chooseFile() {
//        jfc_file = new JFileChooser();
        jfc_file.setFileSelectionMode(JFileChooser.FILES_ONLY); //不选目录
        jfc_file.setMultiSelectionEnabled(false);   //不可多选
//        jfc_file.setDialogTitle("选择报文");
        jfc_file.showOpenDialog(myFrame);
        if(jfc_file.getSelectedFile()!=null) {
            System.out.println(jfc_file.getSelectedFile().getName());
        }
//        File file = jfc_file.getSelectedFile();
//        if (file.isDirectory()) {
//            System.out.println("文件夹:" + file.getAbsolutePath());
//        } else if (file.isFile()) {
//            System.out.println("文件:" + file.getAbsolutePath());
//        }
    }
}
