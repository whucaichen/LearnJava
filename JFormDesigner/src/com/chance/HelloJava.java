/*
 * Created by JFormDesigner on Tue Oct 11 14:26:44 CST 2016
 */

package com.chance;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @author Chance
 */
public class HelloJava extends JPanel {
    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        JFrame jf = new JFrame("HelloJava");
        jf.setContentPane(new HelloJava());
        jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);

        new HelloJavaDialog(jf).setVisible(true);
    }

    public HelloJava() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        toolBar1 = new JToolBar();
        panel2 = new JPanel();
        comboBox1 = new JComboBox();
        checkBox1 = new JCheckBox();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        toggleButton1 = new JToggleButton();
        spinner1 = new JSpinner();
        progressBar1 = new JProgressBar();
        slider1 = new JSlider();
        splitPane1 = new JSplitPane();
        scrollPane1 = new JScrollPane();
        tree1 = new JTree();
        panel1 = new JPanel();
        scrollPane2 = new JScrollPane();
        textArea1 = new JTextArea();
        textField1 = new JTextField();
        button1 = new JButton();
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        Open = new JMenuItem();
        New = new JMenuItem();
        Save = new JMenuItem();
        Exit = new JMenuItem();
        menu2 = new JMenu();

        //======== this ========

        //======== toolBar1 ========
        {

            //======== panel2 ========
            {

                //---- checkBox1 ----
                checkBox1.setText("text");

                //---- radioButton1 ----
                radioButton1.setText("text");

                //---- radioButton2 ----
                radioButton2.setText("text");

                //---- toggleButton1 ----
                toggleButton1.setText("text");

                GroupLayout panel2Layout = new GroupLayout(panel2);
                panel2.setLayout(panel2Layout);
                panel2Layout.setHorizontalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(checkBox1)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButton1)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButton2)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(toggleButton1)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(spinner1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(progressBar1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(slider1, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addContainerGap())
                );
                panel2Layout.setVerticalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panel2Layout.createParallelGroup()
                                .addComponent(slider1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(progressBar1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spinner1)
                                .addComponent(toggleButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboBox1)
                                .addComponent(radioButton2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(checkBox1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addContainerGap())
                );
            }
            toolBar1.add(panel2);
        }

        //======== splitPane1 ========
        {
            splitPane1.setDividerLocation(100);

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(tree1);
            }
            splitPane1.setLeftComponent(scrollPane1);

            //======== panel1 ========
            {

                //======== scrollPane2 ========
                {
                    scrollPane2.setViewportView(textArea1);
                }

                //---- button1 ----
                button1.setText("Send");
                button1.addActionListener(e -> button1ActionPerformed(e));

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(scrollPane2)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button1))))
                );
                panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textField1))
                            .addContainerGap())
                );
            }
            splitPane1.setRightComponent(panel1);
        }

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("\u6587\u4ef6");

                //---- Open ----
                Open.setText("\u6253\u5f00");
                Open.setActionCommand("text");
                menu1.add(Open);

                //---- New ----
                New.setText("\u65b0\u5efa");
                menu1.add(New);

                //---- Save ----
                Save.setText("\u4fdd\u5b58");
                menu1.add(Save);

                //---- Exit ----
                Exit.setText("\u9000\u51fa");
                menu1.add(Exit);
            }
            menuBar1.add(menu1);

            //======== menu2 ========
            {
                menu2.setText("\u5e2e\u52a9");
            }
            menuBar1.add(menu2);
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addComponent(menuBar1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(toolBar1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(splitPane1)
                    .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addComponent(menuBar1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(toolBar1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(splitPane1, GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JToolBar toolBar1;
    private JPanel panel2;
    private JComboBox comboBox1;
    private JCheckBox checkBox1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JToggleButton toggleButton1;
    private JSpinner spinner1;
    private JProgressBar progressBar1;
    private JSlider slider1;
    private JSplitPane splitPane1;
    private JScrollPane scrollPane1;
    private JTree tree1;
    private JPanel panel1;
    private JScrollPane scrollPane2;
    private JTextArea textArea1;
    private JTextField textField1;
    private JButton button1;
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem Open;
    private JMenuItem New;
    private JMenuItem Save;
    private JMenuItem Exit;
    private JMenu menu2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
