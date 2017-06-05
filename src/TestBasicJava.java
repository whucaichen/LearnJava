//package com.chance;

import javax.swing.*;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created by Chance on 16/09/30.
 */
public class TestBasicJava {

    public static void main(String[] args) {

        getDir();
//        printEnvInfo();
//        printPropertiesInfo();
//        calculateSpeed();
//        sameValueSameHash();
//        readArgs(args);
//        readConsole();
//        readConsole2();
//        staticFactory();
//        closeFrameAction();
//        breakAndReturn();
//        fileNameFilter();
//        testUnicode();

//        fibonacci(50);
//        for (int i = 0; i < fibs.size(); i++) {
//            System.out.println(i + " : " + fibs.get(i));
//        }
    }

    public static void getDir() {
        System.out.println(Thread.currentThread().getContextClassLoader().getResource(""));

        System.out.println(TestBasicJava.class.getClassLoader().getResource(""));

        System.out.println(ClassLoader.getSystemResource(""));
        System.out.println(TestBasicJava.class.getResource(""));
        System.out.println(TestBasicJava.class.getResource("/"));
        //Class文件所在路径
        System.out.println(new File("/").getAbsolutePath());
        System.out.println(System.getProperty("user.dir"));

        File fileDir = new File("");
        System.out.println(fileDir.getAbsolutePath());
    }

    public static void printEnvInfo() {
        System.out.println("\n****** ****** ****** Env:");
        Object envs[] = System.getenv().keySet().toArray();
        for (Object env : envs) {
            System.out.println(env + " --- --- " + System.getenv((String) env));
        }
        /**
         * USERNAME --- --- Chance
         * COMPUTERNAME --- --- PCHEN
         * USERDOMAIN --- --- PCHEN
         *
         * windir --- --- C:\Windows
         * ProgramFiles --- --- C:\Program Files
         * ProgramData --- --- C:\ProgramData
         * APPDATA --- --- C:\Users\Chance\AppData\Roaming
         * TMP --- --- C:\Users\Chance\AppData\Local\Temp
         *
         * LOGONSERVER --- --- \\PCHEN
         * HOMEPATH --- --- \Users\Chance
         * USERPROFILE --- --- C:\Users\Chance
         * HOMEDRIVE --- --- C:
         * NUMBER_OF_PROCESSORS --- --- 8
         * PATHEXT --- --- .COM;.EXE;.BAT;.CMD;.VBS;.VBE;.JS;.JSE;.WSF;.WSH;.MSC
         */
    }

    public static void printPropertiesInfo() {
        System.out.println("\n****** ****** ****** Pro:");
        Object pros[] = System.getProperties().keySet().toArray();
        for (Object pro : pros) {
            System.out.println(pro + " --- --- " + System.getProperty((String) pro));
        }
        /**
         * user.name --- --- Chance
         * user.home --- --- C:\Users\Chance
         * user.language --- --- zh
         * user.dir --- --- E:\Workspaces\IdeaProjects\LearnJava
         * user.country --- --- CN
         * file.encoding --- --- UTF-8  （文件内容）
         * file.separator --- --- \
         *
         * os.arch --- --- amd64
         * sun.cpu.isalist --- --- amd64
         * sun.desktop --- --- windows
         * sun.jnu.encoding --- --- GBK （文件名）
         * java.version --- --- 1.8.0_40
         * java.home --- --- D:\Program Files\Java\jdk1.8.0_40\jre
         */
    }

    public static void calculateSpeed() {
        long pre = System.nanoTime();
        System.out.println(9999 << 30);
        System.out.println(System.nanoTime() - pre);

        long pre2 = System.nanoTime();
        System.out.println(9999 * 1024 * 1024 * 1024);
        System.out.println(System.nanoTime() - pre2);
    }

    public static void sameValueSameHash() {
        String s1 = "hello world";
        String s2 = "hello world";
        System.out.println(s1.hashCode() == s2.hashCode());

        Integer i1 = new Integer(666);
        Integer i2 = new Integer(666);
        System.out.println(i1.hashCode() == i2.hashCode());
    }

    public static void readArgs(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    //*** 单个字符
    public static void readConsole() {
        char read = '0';
        System.out.print("输入数据：");
        try {
            //read = System.in.read();
            read = (char) System.in.read();

            byte b[] = new byte[1024];
            int c = System.in.read(b, 5, 10);
            System.out.println(c + " - " + new String(b, 0, c));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("输入数据：" + read);
    }

    //字符串
    public static void readConsole2() {
        Scanner input = new Scanner(System.in);
        System.out.print("输入字符串：");
        String s = input.next();
        System.out.println("您输入的字符串为:" + s);
    }

    public static void staticFactory() {
        //静态工厂方法使用方式：
        try {
            Class c = Class.forName("TestJava");//返回代表Sample类的实例
            System.out.println(c);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //目前比较流行的规范是把静态工厂方法命名为valueOf或者getInstance.
        //valueOf:该方法返回的实例与它的参数具有同样的值，如
        Integer i = Integer.valueOf(100);//返回聚会为100的Integer对象
        System.out.println(i);
        //getInstance:返回的实例与参数匹配，如
        //返回符合中国标准的日历
        Calendar cal = Calendar.getInstance(Locale.CHINA);
        System.out.println(cal);
    }

    public static void closeFrameAction() {
//        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
//        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        UIManager.LookAndFeelInfo[] info = UIManager.getInstalledLookAndFeels();
        for (int i = 0; i < info.length; i++) {
            System.out.println(info[i].getClassName());
        }
        JFrame window1 = new JFrame("窗口A");//创建带标题的窗口
        JFrame window2 = new JFrame("窗口B");
        window1.setBounds(600, 100, 300, 100);//左，上，宽，高
        window2.setBounds(260, 100, 300, 100);
//        window1.pack();
//        window2.pack();
        window1.setVisible(true);
        window2.setVisible(true);
        window1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        window2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void breakAndReturn() {
        labelOne:
        for (int i = 0; i < 4; i++) {
            labelTwo:
            for (int j = 0; j < 4; j++) {
                if (i == 2) {
                    continue labelOne;
                }
                if (i == 3) {
                    break labelOne;
                }
                if (j == 2) {
                    continue labelTwo;
                }
                if (j == 3) {
                    break;
                }
                System.out.println("i=" + i + " j=" + j);
            }
            System.out.println("i=" + i);
        }
    }

    public static void fileNameFilter() {
        File f = new File(System.getProperty("user.dir") + "\\src");
        System.out.println(f.getPath());
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".java");
            }
        };
        String[] files = f.list(filter);
        for (String a : files) {
            System.out.println(a);
        }
    }

    public static void testUnicode() {
        char c = '\u5e2e';
        String s = "\u5e2e\u52a9(H)";
        System.out.println(c);
        System.out.println(s);
    }

    public static Vector fibs = new Vector();

    public static long fibonacci(int n) {
        fibs.add(0, 0l);
        fibs.add(1, 1l);
        return fib(n);
    }

    public static long fib(int n) {
        long result;
        if (n > fibs.size() - 1) {
            result = fib(n - 1) + fib(n - 2);
            fibs.add(n, result);
        } else {
            result = (long) fibs.get(n);
        }
        return result;
    }
}