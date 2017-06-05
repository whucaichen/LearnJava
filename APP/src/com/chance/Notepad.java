package com.chance;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * Created by Chance on 16/08/23.
 */

public class Notepad extends JFrame {
    JMenuBar menub = new JMenuBar();
    JTextArea text = new JTextArea();
    JMenu files = new JMenu("文件(F)");
    JMenu edit = new JMenu("编辑(E)");
    JMenu formats = new JMenu("格式(O)");
    JMenu help = new JMenu("帮助(H)");
    JMenuItem newFile = new JMenuItem("新建(N)");
    JMenuItem open = new JMenuItem("打开(O)...");
    JMenuItem save = new JMenuItem("保存(S)");
    JMenuItem saveAs = new JMenuItem("另存为(A)...");
    JMenuItem exit = new JMenuItem("退出(X)");
    JMenuItem undo = new JMenuItem("撤销(U)");
    JMenuItem cut = new JMenuItem("剪切(T)");
    JMenuItem copy = new JMenuItem("复制(C)");
    JMenuItem paste = new JMenuItem("粘贴(P)");
    JMenuItem selectAll = new JMenuItem("全选(A)");
    JMenuItem timeDate = new JMenuItem("时间/日期(D)");
    JCheckBoxMenuItem lineWrap = new JCheckBoxMenuItem("自动换行(M)");
    JMenuItem fonts = new JMenuItem("字体...");
    JMenuItem about = new JMenuItem("关于记事本(A)");
    JFrame th = this;
    String name;
    String openedPath = null;
    boolean opened = false;
    boolean reworked = false;

    //初始化窗体
    Notepad(String name) {
        super(name);
        this.name = name;
        int x, y;
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        x = (size.width - 600) / 2;
        y = (size.height - 400) / 2;
        setSize(600, 400);
        setLocation(x, y);
        //让程序界面显示在屏幕中央
        setMinimumSize(new Dimension(250, 150));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    //初始化布局
    void init() {
        files.setMnemonic('F');
        edit.setMnemonic('E');
        formats.setMnemonic('O');
        help.setMnemonic('H');
        newFile.setMnemonic('N');
        open.setMnemonic('O');
        save.setMnemonic('S');
        saveAs.setMnemonic('A');
        exit.setMnemonic('X');
        undo.setMnemonic('U');
        cut.setMnemonic('T');
        copy.setMnemonic('C');
        paste.setMnemonic('P');
        selectAll.setMnemonic('A');
        timeDate.setMnemonic('D');
        lineWrap.setMnemonic('M');
        about.setMnemonic('A');
        //为控件添加助记符
        newFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
        open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
        save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_MASK));
        cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
        copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
        paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_MASK));
        selectAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
        timeDate.setAccelerator(KeyStroke.getKeyStroke("F5"));
        //为控件添加快捷键
        files.add(newFile);
        files.add(open);
        files.add(save);
        files.add(saveAs);
        files.addSeparator();
        files.add(exit);
        edit.add(undo);
        edit.addSeparator();
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.addSeparator();
        edit.add(selectAll);
        edit.add(timeDate);
        formats.add(lineWrap);
        formats.add(fonts);
        help.add(about);
        menub.add(files);
        menub.add(edit);
        menub.add(formats);
        menub.add(help);
        setJMenuBar(menub);
        getContentPane().add(new JScrollPane(text));
        Listen listen = new Listen();
        Listen1 listen1 = new Listen1();
        newFile.addActionListener(listen);
        open.addActionListener(listen);
        save.addActionListener(listen);
        saveAs.addActionListener(listen);
        exit.addActionListener(listen);
        cut.addActionListener(listen);
        copy.addActionListener(listen);
        paste.addActionListener(listen);
        selectAll.addActionListener(listen);
        timeDate.addActionListener(listen);
        lineWrap.addActionListener(listen);
        about.addActionListener(listen);
        open.addActionListener(listen1);
        save.addActionListener(listen1);
        saveAs.addActionListener(listen1);
        //为控件添加事件侦听器
        undo.setEnabled(false);
        fonts.setEnabled(false);
        //暂时没有实现的功能
    }

    class Listen implements ActionListener {
        //实现用于一般操作的事件侦听器
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();

            if (source == newFile) {
                text.setText("");
                th.setTitle(name);
                openedPath = null;
                opened = false;
            } else if (source == exit)
                System.exit(0);
            else if (source == selectAll)
                text.selectAll();
            else if (source == cut)
                text.cut();
            else if (source == copy)
                text.copy();
            else if (source == paste)
                text.paste();
            else if (source == lineWrap)
                text.setLineWrap(!text.getLineWrap());
            else if (source == about) {
                String message = "                   ----Magin child----";
                JOptionPane.showMessageDialog(th, message, "关于", JOptionPane.PLAIN_MESSAGE);
            } else if (source == timeDate) {
                Date nowTime = new Date();
                SimpleDateFormat times = new SimpleDateFormat("HH:mm yyyy-MM-dd");
                text.insert(times.format(nowTime), text.getCaretPosition());
            }
        }
    }

    class Listen1 implements ActionListener {
        //实现用于对文件进行操作的事件侦听器
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();
            //打开文件事件
            if (source == open) {
                FileDialog openFile = new FileDialog(th, "打开文件...", FileDialog.LOAD);
                openFile.setVisible(true);
                String filePath = openFile.getDirectory() + openFile.getFile();
                try {
                    FileInputStream fis = new FileInputStream(filePath);
                    byte[] content = new byte[fis.available()];
                    fis.read(content);
                    text.setText(new String(content));
                    text.setCaretPosition(0);
                    if (openFile.getFile() != null) {
                        th.setTitle(openFile.getFile() + name);
                        openedPath = filePath;
                        opened = true;
                    }
                    fis.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                opened = true;
            }
            //保存及另存为事件
            else if (source == save || source == saveAs) {
                String savePath = openedPath;
                if (savePath == null || source == saveAs) {
                    FileDialog saveFile = new FileDialog(th, "保存文件...", FileDialog.SAVE);
                    saveFile.setVisible(true);
                    savePath = saveFile.getDirectory() + saveFile.getFile();
                }
                try {
                    FileOutputStream fos = new FileOutputStream(savePath);
                    fos.write(text.getText().getBytes());
                    fos.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                if (source == save)
                    openedPath = savePath;
            }
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.err.println("Couldn't use the system look and feel:" + e);
        }
        String name = ("--Magin-child V0.01--");
        //让界面呈现跟系统一致的外观
        //JFrame.setDefaultLookAndFeelDecorated(true);
        //JDialog.setDefaultLookAndFeelDecorated(true);
        Notepad note = new Notepad(name);
        note.init();
        note.setVisible(true);
    }
}