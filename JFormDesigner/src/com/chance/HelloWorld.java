package com.chance;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/**
 * Created by Chance on 16/10/11.
 */
public class HelloWorld {
    private JPanel panel1;
    private JTree tree1;
    private JTextArea messageHistoryTextArea;
    private JTextField messageTextField;
    private JButton sendButton;
    private JSpinner spinner1;

    public HelloWorld() {
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("send msg");
                HelloWorldDialog dialog = new HelloWorldDialog();
                dialog.pack();
                dialog.setVisible(true);
//                System.exit(0);
            }
        });
        tree1.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                System.out.println(e);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloWorld");
        frame.setContentPane(new HelloWorld().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
