package com.chance.layout;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * @author closewubq
 */
public class BoxLayoutDemo {
    public static void addComponentsToPane(Container pane) {
        JPanel xPanel = new JPanel();
        xPanel.setLayout(new BoxLayout(xPanel, BoxLayout.X_AXIS));
        addButtons(xPanel);
        JPanel yPanel = new JPanel();
        yPanel.setLayout(new BoxLayout(yPanel, BoxLayout.Y_AXIS));
        addButtons(yPanel);

        pane.add(yPanel, BorderLayout.PAGE_START);
        pane.add(xPanel, BorderLayout.PAGE_END);
    }
    private static void addAButton(String text, Container container) {
        JButton button = new JButton(text);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(button);
    }
    private static void addButtons(Container container) {
        addAButton("Button 1", container);
        addAButton("Button 2", container);
        addAButton("Button 3", container);
        addAButton("Long Button 4", container);
        addAButton("Button 5", container);
    }
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("BoxLayoutManage");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addComponentsToPane(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });

    }
}