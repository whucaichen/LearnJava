package com.chance.module;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FrameJInternal extends JFrame implements ActionListener {
    JDesktopPane desktopPane;
    int count = 1;

    public FrameJInternal() {
        super("JInternalFrameDemo1");
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new BorderLayout());

        JButton button = new JButton("Crate New Internal Frames");
        button.addActionListener(this);
        contentPane.add(button, BorderLayout.SOUTH);

        desktopPane = new JDesktopPane();
        contentPane.add(desktopPane);//將虛擬桌面加入到content pane中

        this.setSize(new Dimension(300, 300));
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JInternalFrame internalFrame = new JInternalFrame("Internale Frame" + count++, true, true, true, true);
        //internalFrame.setLocation(20,20);
        internalFrame.setSize(new Dimension(200, 200));
        internalFrame.setVisible(true);

        Container icontentPane = internalFrame.getContentPane();
        JTextArea textArea = new JTextArea();
        JButton b = new JButton("Internale Frame Button");
        icontentPane.add(textArea, "Center");
        icontentPane.add(b, "South");

        desktopPane.add(internalFrame);//將internalFrame加入到desktopPane,通過虛擬桌面來管理internalFrame
        //this.getContentPane().add(internalFrame);
        try {
            internalFrame.setSelected(true);//獲得焦點
        } catch (java.beans.PropertyVetoException ex) {
            System.out.println("Exception while selecting");
        }
    }

    public static void main(String... args) {
        new FrameJInternal();
    }
}