package com.chance.module;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Chance on 16/08/10.
 */
public class FrameJComboList extends JFrame {

    public static void main(String[] args) {
        new FrameJComboList();
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

    public FrameJComboList() throws HeadlessException {
        //几个常用组件的综合应用:列表框,下拉框,
		jl1 = new JLabel("请选择城市:");
		jl2 = new JLabel("请选择景点:");
		String jg [] = new String[]{"北京", "南京", "天津"};
		jcb = new JComboBox(jg);
		String jd [] = new String[]{"长城", "天安门", "黄河"};
		jl = new JList(jd);
		jl.setVisibleRowCount(2);////设置希望显示多少个选项
		jsp = new JScrollPane(jl);//把列表加入到滚动条中
		//面板
		jp1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jp2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jp1.add(jl1);
		jp1.add(jcb);
		jp2.add(jl2);
		jp2.add(jsp);//加入带列表的滚动条
		this.add(jp1);
		this.add(jp2);
		this.setLayout(new GridLayout(2,1,1,1));
		this.setTitle("请选择");
		this.setResizable(false);//设置用户不能随意修改大小
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置当窗体关闭时,退出jvm(虚拟机);
		this.setSize(300, 200);//大小(像素)
		this.setLocation(200,200);//设置窗体的位置,x = 200, y = 200;
		this.setVisible(true);//显示,默认为false
    }
}
