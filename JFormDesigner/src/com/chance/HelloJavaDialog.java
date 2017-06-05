/*
 * Created by JFormDesigner on Thu Oct 13 10:37:24 CST 2016
 */

package com.chance;

import java.awt.*;
import java.io.IOException;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import javax.swing.table.*;
import javax.swing.tree.*;

/**
 * @author Chance
 */
public class HelloJavaDialog extends JDialog {
    public HelloJavaDialog(Frame owner) {
        super(owner);
        initComponents();
    }

    public HelloJavaDialog(Dialog owner) {
        super(owner);
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        tabbedPane1 = new JTabbedPane();
        label1 = new JLabel();
        panel2 = new JPanel();
        scrollPane4 = new JScrollPane();
        try {
            editorPane1 = new JEditorPane("http://www.94994.com/");
        } catch (IOException e) {
            e.printStackTrace();
        }
        panel1 = new JPanel();
        textField1 = new JTextField();
        button1 = new JButton();
        scrollPane3 = new JScrollPane();
        tree1 = new JTree();
        scrollPane2 = new JScrollPane();
        table1 = new JTable();
        desktopPane2 = new JDesktopPane();
        internalFrame1 = new JInternalFrame();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();
        helpButton = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {

                //======== tabbedPane1 ========
                {

                    //---- label1 ----
                    label1.setText("Tab1");
                    tabbedPane1.addTab("Tab1", label1);

                    //======== panel2 ========
                    {
                        panel2.setLayout(new BorderLayout());

                        //======== scrollPane4 ========
                        {
                            scrollPane4.setViewportView(editorPane1);
                        }
                        panel2.add(scrollPane4, BorderLayout.CENTER);
                    }
                    tabbedPane1.addTab("Tab3", panel2);

                    //======== panel1 ========
                    {
                        panel1.setLayout(new BorderLayout());

                        //---- textField1 ----
                        textField1.setText("Tab2");
                        panel1.add(textField1, BorderLayout.NORTH);

                        //---- button1 ----
                        button1.setText("Button");
                        panel1.add(button1, BorderLayout.SOUTH);

                        //======== scrollPane3 ========
                        {

                            //---- tree1 ----
                            tree1.setModel(new DefaultTreeModel(
                                new DefaultMutableTreeNode("(Item)") {
                                    {
                                        DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("item1");
                                            node1.add(new DefaultMutableTreeNode("item11"));
                                            node1.add(new DefaultMutableTreeNode("item12"));
                                            node1.add(new DefaultMutableTreeNode("item13"));
                                        add(node1);
                                        node1 = new DefaultMutableTreeNode("item2");
                                            node1.add(new DefaultMutableTreeNode("item21"));
                                            node1.add(new DefaultMutableTreeNode("item22"));
                                        add(node1);
                                        node1 = new DefaultMutableTreeNode("item3");
                                            node1.add(new DefaultMutableTreeNode("item31"));
                                        add(node1);
                                        add(new DefaultMutableTreeNode("item4"));
                                    }
                                }));
                            scrollPane3.setViewportView(tree1);
                        }
                        panel1.add(scrollPane3, BorderLayout.CENTER);
                    }
                    tabbedPane1.addTab("Tab2", panel1);

                    //======== scrollPane2 ========
                    {

                        //---- table1 ----
                        table1.setModel(new DefaultTableModel(
                            new Object[][] {
                                {"1", "11", "111"},
                                {"2", "22", "222"},
                                {"3", "33", "333"},
                                {"4", "44", "444"},
                            },
                            new String[] {
                                "ID", "NAME", "VALUE"
                            }
                        ));
                        scrollPane2.setViewportView(table1);
                    }
                    tabbedPane1.addTab("Tab4", scrollPane2);
                }

                //======== desktopPane2 ========
                {
                    desktopPane2.setBackground(Color.lightGray);

                    //======== internalFrame1 ========
                    {
                        internalFrame1.setVisible(true);
                        Container internalFrame1ContentPane = internalFrame1.getContentPane();
                        internalFrame1ContentPane.setLayout(new BoxLayout(internalFrame1ContentPane, BoxLayout.X_AXIS));
                    }
                    desktopPane2.add(internalFrame1, JLayeredPane.DEFAULT_LAYER);
                    internalFrame1.setBounds(60, 25, 160, 80);
                }

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addComponent(desktopPane2)
                        .addComponent(tabbedPane1)
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addComponent(tabbedPane1, GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(desktopPane2, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
                );
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 85, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0, 0.0};

                //---- okButton ----
                okButton.setText("OK");
                buttonBar.add(okButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- cancelButton ----
                cancelButton.setText("Cancel");
                buttonBar.add(cancelButton, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- helpButton ----
                helpButton.setText("Help");
                buttonBar.add(helpButton, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JTabbedPane tabbedPane1;
    private JLabel label1;
    private JPanel panel2;
    private JScrollPane scrollPane4;
    private JEditorPane editorPane1;
    private JPanel panel1;
    private JTextField textField1;
    private JButton button1;
    private JScrollPane scrollPane3;
    private JTree tree1;
    private JScrollPane scrollPane2;
    private JTable table1;
    private JDesktopPane desktopPane2;
    private JInternalFrame internalFrame1;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    private JButton helpButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
