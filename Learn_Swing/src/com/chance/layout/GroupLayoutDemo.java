package com.chance.layout;

/**
 * @author ：陶伟基 ，微博：http://weibo.com/taoandtao
 * @date ：2012/12/10
 * @place：广州大学华软软件学院
 */

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 GroupLayout 是一个 LayoutManager，它将组件按层次分组，以决定它们在 Container 中的位置。GroupLayout 主要供生成器使用，但也可以手工编码。
 分组由 Group 类的实例来完成。GroupLayout 支持两种组。串行组 (sequential group) 按顺序一个接一个地放置其子元素。并行组 (parallel group) 能够以四种方式对齐其子元素。
 每个组可以包含任意数量的元素，其中元素有 Group、Component 或间隙 (gap)。间隙可被视为一个具有最小大小、首选大小和最大大小的不可见组件。此外，GroupLayout 还支持其值取自 LayoutStyle 的首选间隙。
 GroupLayout是一个很重要的是额布局管理器，在jdk 1.6才加入，配合其它的管理器可以实现很好的界面。
 GroupLayout必须要设置它的GroupLayout.setHorizontalGroup和GroupLayout.setVerticalGroup。
 GroupLayout.setHorizontalGroup是指按照水平来确定，下面例子“账号”和“密码”是一个级别的，其它的组件也是一个级别的。详情请看代码
 GroupLayout.setVerticalGroup。是按照垂直来确定的。他们的级别是按照Group去设置组件的优先级别，级别越高就显示越上面。
 GroupLayout.setHorizontalGroup(SequentialGroup(ParallelGroup(component)));
 大概就是按照这个顺序去添加,当然不是就这么简单设置，多个component添加到ParallelGroup，然后多个ParallelGroup添加到SequentialGroup里面，
 然后就设置到GroupLayout
 */
public class GroupLayoutDemo extends javax.swing.JFrame {
    public static void main(String[] args) {
        GroupLayoutDemo f = new GroupLayoutDemo();
    }

    JLabel label1;
    JLabel label2;
    JLabel label3;
    JTextField tf;
    JPasswordField psf;
    JRadioButton rb1;
    JRadioButton rb2;

    JButton bt1;
    JButton bt2;

    public GroupLayoutDemo() {
        this.setVisible(true);
        this.setSize(250, 220);
        this.setVisible(true);
        this.setLocation(400, 200);

        label1 = new JLabel("华软BBS快捷登陆");
        label2 = new JLabel("账号：");
        label3 = new JLabel("密码：");
        tf = new JTextField();
        psf = new JPasswordField();
        rb1 = new JRadioButton("记住密码");
        rb2 = new JRadioButton("自动登陆");
        bt1 = new JButton("登陆");
        // 为指定的 Container 创建 GroupLayout

        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);

        //创建GroupLayout的水平连续组，，越先加入的ParallelGroup，优先级级别越高。
        GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
        hGroup.addGap(5);//添加间隔
        hGroup.addGroup(layout.createParallelGroup().addComponent(label2)
                .addComponent(label3));
        hGroup.addGap(5);
        hGroup.addGroup(layout.createParallelGroup().addComponent(label1)
                .addComponent(psf).addComponent(rb1).addComponent(rb2)
                .addComponent(tf).addComponent(bt1));
        hGroup.addGap(5);
        layout.setHorizontalGroup(hGroup);
        //创建GroupLayout的垂直连续组，，越先加入的ParallelGroup，优先级级别越高。
        GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();
        vGroup.addGap(10);
        vGroup.addGroup(layout.createParallelGroup().addComponent(label1));
        vGroup.addGap(10);
        vGroup.addGroup(layout.createParallelGroup().addComponent(label2)
                .addComponent(tf));
        vGroup.addGap(5);
        vGroup.addGroup(layout.createParallelGroup().addComponent(label3)
                .addComponent(psf));
        vGroup.addGroup(layout.createParallelGroup().addComponent(rb1));

        vGroup.addGroup(layout.createParallelGroup().addComponent(rb2));
        vGroup.addGroup(layout.createParallelGroup(Alignment.TRAILING)
                .addComponent(bt1));
        vGroup.addGap(10);
        //设置垂直组
        layout.setVerticalGroup(vGroup);
    }
}