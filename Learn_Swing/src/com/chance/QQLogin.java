package com.chance;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Chance on 16/08/10.
 */
public class QQLogin extends JFrame {

    public static void main(String[] args) {
        new QQLogin();
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

    public QQLogin() throws HeadlessException {
        //qq登录界面
		jl1 = new JLabel(new ImageIcon("images/bg.gif"));
		jl2 = new JLabel("QQ号码", JLabel.CENTER);
		jl3 = new JLabel("QQ密码", JLabel.CENTER);
		jl4 = new JLabel("忘记密码", JLabel.CENTER);
		jl4.setFont(new Font("宋体", Font.PLAIN, 16));//设置字体
		jl4.setForeground(Color.BLUE);
		jl5 = new JLabel("<html><a href='www.qq.com'>申请密码保护</a>");//设置超链接
		jl5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//鼠标变成"手形"
		jcb1 = new JCheckBox("隐身登录");
		jcb2 = new JCheckBox("记住密码");
		jtf1 = new JTextField();
		jpf1 = new JPasswordField();
		jtp = new JTabbedPane();
		jp1 = new JPanel();
		jp2 = new JPanel(new GridLayout(3,3,5,5));
		jp3 = new JPanel();
		jp3.setBackground(Color.BLUE);
		jp4 = new JPanel();
		jp4.setBackground(Color.CYAN);
		jb4 = new JButton("清除号码");
		jb1 = new JButton("登          录");
		jb2 = new JButton("取          消");
		jb3 = new JButton("注册向导");
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp2.add(jl2);
		jp2.add(jtf1);
		jp2.add(jb4);
		jp2.add(jl3);
		jp2.add(jpf1);
		jp2.add(jl4);
		jp2.add(jcb1);
		jp2.add(jcb2);
		jp2.add(jl5);
		jtp.add("QQ号码",jp2);
		jtp.add("手机号码",jp3);
		jtp.add("QQ邮箱",jp4);
		this.setLayout(new BorderLayout());
		this.add(jtp);
		this.add(jl1, BorderLayout.NORTH);
		this.add(jp1, BorderLayout.SOUTH);
		//this.setTitle("qq聊天");
		this.setIconImage(new ImageIcon("images/f8.png").getImage());//设置Icon
		this.setResizable(false);//设置用户不能随意修改大小
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置当窗体关闭时,退出jvm(虚拟机);
		this.setSize(300, 250);//大小(像素)
		this.setLocation(500,400);//设置窗体的位置,x = 200, y = 200;
		this.setVisible(true);//显示,默认为false
    }
}
