package com.chance;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Chance on 16/08/10.
 */
public class FrameLogin extends JFrame {

    public static void main(String[] args) {
        new FrameLogin();
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

    public FrameLogin() throws HeadlessException {
        //几个常用组件的综合应用:登录系统-可编辑文本框,标签,密码框
		jb1 = new JButton("确定");
		jb2 = new JButton("取消");
		jl1 = new JLabel("用户名");
		jl2 = new JLabel("密     码");
		jpf1 = new JPasswordField(10);//实例化并设置大小
		jtf1 = new JTextField(10);
		//定义面板
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		//组件加入面板
		jp1.add(jl1);
		jp1.add(jtf1);
		jp2.add(jl2);
		jp2.add(jpf1);
		jp3.add(jb1);
		jp3.add(jb2);
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		//设置布局方式
		this.setLayout(new GridLayout(3,1,1,1));
		this.setTitle("请登录");
		this.setResizable(false);//设置用户不能随意修改大小
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置当窗体关闭时,退出jvm(虚拟机);
		this.setSize(300, 170);//大小(像素)
		this.setLocation(200,200);//设置窗体的位置,x = 200, y = 200;
		this.setVisible(true);//显示,默认为false
    }
}
