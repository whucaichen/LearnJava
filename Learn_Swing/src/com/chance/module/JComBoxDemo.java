package com.chance.module;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

class JComboBoxDemo {
    JFrame mainFrame;
    JComboBox simpleComboBox;

    public JComboBoxDemo() {
        mainFrame = new JFrame("JComboBoxDemo");
        Vector<String> cbData = new Vector<String>();
        cbData.add("res/pic1.jpg");
        cbData.add("res/pic2.jpg");
        cbData.add("res/pic3.jpg");
        cbData.add("res/pic4.jpg");
        simpleComboBox = new JComboBox(cbData);
        simpleComboBox.setPreferredSize(new Dimension(200, 130));
        simpleComboBox.setMaximumRowCount(2);
        simpleComboBox.setRenderer(new CustomComboBoxRenderer());
        mainFrame.getContentPane().add(simpleComboBox);
        simpleComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("selection changed");
                System.out.println(simpleComboBox.getSelectedItem());
            }
        });
        simpleComboBox.setCursor(new Cursor(Cursor.HAND_CURSOR));
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new JComboBoxDemo();
    }

    class CustomComboBoxRenderer extends JLabel implements ListCellRenderer {
        CustomComboBoxRenderer() {
            setOpaque(true);
            setHorizontalAlignment(CENTER);
            setVerticalAlignment(CENTER);

        }

        public Component getListCellRendererComponent(
                JList list,
                Object value,
                int index,
                boolean isSelected,
                boolean cellHasFocus) {
            if (isSelected) {
                setBackground(list.getSelectionBackground());
                setForeground(list.getSelectionForeground());
            } else {
                setBackground(list.getBackground());
                setForeground(list.getForeground());
            }
            String imageFileName = (String) value;
            ImageIcon labelIcon = new ImageIcon(imageFileName);
            setText(imageFileName.substring(imageFileName.lastIndexOf("/") + 1));
            setIcon(labelIcon);
            return this;
        }
    }
}

