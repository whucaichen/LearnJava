package com.chance.module;

import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;

class JListCustomDemo {
    JFrame mainFrame;
    JList simpleList;

    public JListCustomDemo() {
        mainFrame = new JFrame("JListCustomDemo");

        final DefaultListModel model = new DefaultListModel();
        model.addElement("button1");
        model.addElement("button2");
        simpleList = new JList(model);
        simpleList.setCellRenderer(new CustomListCellRenderer());

        simpleList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                System.out.println(model.getElementAt(simpleList.getSelectedIndex()));
            }
        });

        mainFrame.add(simpleList);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new JListCustomDemo();
    }
}

class CustomListCellRenderer implements ListCellRenderer {
    public Component getListCellRendererComponent(
            JList list,
            Object value,
            int index,
            boolean isSelected,
            boolean cellHasFocus
    ) {
        return new JButton((String) value);
    }

}


