package com.chance.layout;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Chance on 16/08/10.
 */
public class FrameFlowLayout extends JFrame{

    public static void main(String[] args) {
        new FrameFlowLayout();
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

    public FrameFlowLayout() {
        //流式布局,FlowLayout
		jb1 = new JButton("关雨");//实例化按钮并设置文字
		jb2 = new JButton("张飞");
		jb3 = new JButton("赵云");
		jb4 = new JButton("马超");
		jb5 = new JButton("刘备");
		jb6 = new JButton("我地");
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		this.add(jb6);
		//设置布局方式,并设置对齐方式,默认为居中
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.setTitle("我是流式布局");
//		this.setResizable(false);//设置用户不能随意修改大小
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置当窗体关闭时,退出jvm(虚拟机);
		this.setSize(300, 400);//大小(像素)
		this.setLocation(200,200);//设置窗体的位置,x = 200, y = 200;
		this.setVisible(true);//显示,默认为false
    }
}
