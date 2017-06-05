package com.chance;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Chance on 16/08/10.
 */
public class Notepad extends JFrame {

    public static void main(String[] args) {
        new Notepad();
    }

    //JButton jb ;//在此定义组件
    JButton jb1, jb2, jb3, jb4, jb5, jb6;//按钮
    JPanel jp1, jp2, jp3, jp4, jp5;//面板
    JLabel jl1, jl2, jl3, jl4, jl5;//标签
    JTextField jtf1, jtf2;//可编辑文本框
    JPasswordField jpf1;//密码框
    JCheckBox jcb1, jcb2, jcb3;//复选框
    JRadioButton jrb1, jrb2;//单选框,需要先放入到ButtonGroup中,否则不能实现单选
    ButtonGroup bg;
    JComboBox jcb;//下拉框
    JList jl;//列表框组件
    JScrollPane jsp;//滚动条,通常与JList结合使用
    JSplitPane jsp1;//拆分窗口,容器类组件
    JTextArea jta; //多行文本框
    JTabbedPane jtp;//选项卡窗格
    JMenuBar jmb;//菜单条组件:树干
    JMenu jm1, jm2, jm3, jm4, jm5, jm6;//菜单条组件:树枝,下面可再有树枝...直到树叶 为止
    JMenuItem jmi1, jmi2, jmi3, jmi4, jmi5, jmi6, jmi7, jmi8, jmi9;//菜单项组件:树叶
    JToolBar jtb;//容器类组件,又叫功能组件
    int size = 9;
    JButton[] jbs = new JButton[size];

    public Notepad() throws HeadlessException {
        //记事本:菜单应用
        jtb = new JToolBar();//新建工具条
        jb1 = new JButton("新建");
        jb1.setToolTipText("新建一个文件");//设置当鼠标移动到这个按钮时显示的提示信息
        jb2 = new JButton("保存");
        jb2.setToolTipText("保存一个文件");
        jb3 = new JButton("打开");
        jb4 = new JButton("复制");
        jb5 = new JButton("粘贴");
        jb6 = new JButton("剪切");
        jmb = new JMenuBar();//新建菜单条:树干
        jm1 = new JMenu("文件(F)");
        jm1.setMnemonic('F');//设置助记符
        jm2 = new JMenu("编辑(E)");
        jm2.setMnemonic('E');
        jm3 = new JMenu("格式(O)");
        jm3.setMnemonic('O');
        jm4 = new JMenu("查看(V)");
        jm4.setMnemonic('V');
        jm5 = new JMenu("帮助(H)");
        jm5.setMnemonic('H');
        jm6 = new JMenu("新建");
        jmi1 = new JMenuItem("文件");
        jmi2 = new JMenuItem("工程");
        jmi3 = new JMenuItem("打开", new ImageIcon("iamges/f8.png"));
        jmi4 = new JMenuItem("保存(s)");
        jmi4.setMnemonic('S');
        //jmi4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.vk_S,));
        jmi5 = new JMenuItem("另存为");
        jmi6 = new JMenuItem("页面设置");
        jmi7 = new JMenuItem("打印");
        jmi8 = new JMenuItem("退出");
        jm6.add(jmi1);//新建中加入树叶
        jm6.add(jmi2);
        jm1.add(jm6);//为文件菜单加入树枝树叶
        //jm1.add(jmi2);
        jm1.add(jmi3);
        jm1.add(jmi4);
        jm1.add(jmi5);
        jm1.addSeparator();//加入分割线
        jm1.add(jmi6);
        jm1.add(jmi7);
        jm1.addSeparator();
        jm1.add(jmi8);
        jmb.add(jm1);//将菜单添加到菜单条上
        jmb.add(jm2);
        jmb.add(jm3);
        jmb.add(jm4);
        jmb.add(jm5);
        jta = new JTextArea();//多行文本框
        jtb.add(jb1);
        jtb.add(jb2);
        jtb.add(jb3);
        jtb.add(jb4);
        jtb.add(jb5);
        jtb.add(jb6);
        //将菜单条加入到窗体上
        this.setJMenuBar(jmb);
        this.add(jtb, BorderLayout.NORTH);//将工具条加入到窗体(布局)中
        jsp = new JScrollPane(jta);
        //jsp.setVerticalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);//设置下拉条风格
        this.add(jsp);
        this.setTitle("记事本");
        this.setIconImage(new ImageIcon("images/f8.png").getImage());//设置Icon
        this.setResizable(false);//设置用户不能随意修改大小
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置当窗体关闭时,退出jvm(虚拟机);
        this.setSize(400, 550);//大小(像素)
        this.setLocation(500, 400);//设置窗体的位置,x = 200, y = 200;
        this.setVisible(true);//显示,默认为false
    }
}
