package com.chance;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Chance on 16/08/10.
 */
public class QQChat extends JFrame {

    public static void main(String[] args) {
        new QQChat();
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

    public QQChat() throws HeadlessException {
        //QQ聊天界面
		jta = new JTextArea();
		jsp = new JScrollPane(jta);//加入滚动条
		jp1 = new JPanel();
		String myj [] = new String [] {"钟志钢","王磊","刘绮霞"};
		jcb = new JComboBox(myj);
		jtf1 = new JTextField(20);
		jb1 = new JButton("发送");
		jp1.add(jcb);
		jp1.add(jtf1);
		jp1.add(jb1);
		this.setLayout(new BorderLayout());
		this.add(jsp);
		this.add(jp1, BorderLayout.SOUTH);
		this.setTitle("qq聊天");
		this.setIconImage(new ImageIcon("images/f8.png").getImage());//设置Icon
		this.setResizable(false);//设置用户不能随意修改大小
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置当窗体关闭时,退出jvm(虚拟机);
		this.setSize(500, 500);//大小(像素)
		this.setLocation(200,200);//设置窗体的位置,x = 200, y = 200;
		this.setVisible(true);//显示,默认为false
    }
}
