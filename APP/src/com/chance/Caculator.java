package com.chance;

import java.awt.*;
import java.awt.event.*;

/**
 * Created by Chance on 16/08/23.
 */
public class Caculator {
    String s = "", s1 = null, s2 = null;
    Frame f = new Frame("计算器");
    TextField tf = new TextField(30);
    Panel p1 = new Panel();
    Panel p2 = new Panel();
    Panel p3 = new Panel();
    Button bt1 = new Button("=");
    Button bt2 = new Button("删除");
    Button[] bt = new Button[16];
    int id = 0;

    public static void main(String[] args) {
        new Caculator().init();
    }

    public void init() {
        f.setBackground(new Color(85, 247, 253));
        f.setLayout(new BorderLayout(4, 4));
        p2.setLayout(new GridLayout(4, 4, 4, 4));
        p3.setLayout(new BorderLayout(4, 4));
        f.setResizable(false);
        f.add(p1, BorderLayout.NORTH);
        f.add(p2);
        p3.add(bt2, BorderLayout.NORTH);
        p3.add(bt1);
        p1.add(tf);
        f.add(p3, BorderLayout.EAST);
        String[] b = {"1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", "0", ".", "复位", "/"};
        for (int i = 0; i < 16; i++) {
            bt[i] = new Button(b[i]);
            p2.add(bt[i]);
        }
        bt[0].setForeground(Color.blue);
        bt[1].setForeground(Color.blue);
        bt[2].setForeground(Color.blue);
        bt[4].setForeground(Color.blue);
        bt[5].setForeground(Color.blue);
        bt[6].setForeground(Color.blue);
        bt[8].setForeground(Color.blue);
        bt[9].setForeground(Color.blue);
        bt[10].setForeground(Color.blue);
        bt[12].setForeground(Color.blue);
        bt[13].setForeground(Color.blue);
        bt[3].setForeground(Color.red);
        bt[7].setForeground(Color.red);
        bt[11].setForeground(Color.red);
        bt[15].setForeground(Color.red);
        bt[14].setForeground(Color.red);
        bt1.setForeground(Color.red);
        bt2.setForeground(Color.red);
        f.pack();
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
                                public void windowClosing(WindowEvent e) {
                                    System.exit(0);
                                }
                            }
        );
        bt[0].addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        s += 1;
                                        s2 += 1;
                                        tf.setText(s);
                                    }
                                }
        );
        bt[1].addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        s += 2;
                                        s2 += 2;
                                        tf.setText(s);
                                    }
                                }
        );
        bt[2].addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        s += 3;
                                        s2 += 3;
                                        tf.setText(s);
                                    }
                                }
        );
        bt[4].addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        s += 4;
                                        s2 += 4;
                                        tf.setText(s);
                                    }
                                }
        );
        bt[5].addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        s += 5;
                                        s2 += 5;
                                        tf.setText(s);
                                    }
                                }
        );
        bt[6].addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        s += 6;
                                        s2 += 6;
                                        tf.setText(s);
                                    }
                                }
        );
        bt[8].addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        s += 7;
                                        s2 += 7;
                                        tf.setText(s);
                                    }
                                }
        );
        bt[9].addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        s += 8;
                                        s2 += 8;
                                        tf.setText(s);
                                    }
                                }
        );
        bt[10].addActionListener(new ActionListener() {
                                     public void actionPerformed(ActionEvent e) {
                                         s += 9;
                                         s2 += 9;
                                         tf.setText(s);
                                     }
                                 }
        );
        bt[12].addActionListener(new ActionListener() {
                                     public void actionPerformed(ActionEvent e) {
                                         s += 0;
                                         s2 += 0;
                                         tf.setText(s);
                                     }
                                 }
        );
        bt[13].addActionListener(new ActionListener() {
                                     public void actionPerformed(ActionEvent e) {
                                         s += '.';
                                         s2 += '.';
                                         tf.setText(s);
                                     }
                                 }
        );
        bt[3].addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        s1 = s;
                                        s += '+';
                                        id = 1;
                                        s2 = "";
                                        tf.setText(s);
                                    }
                                }
        );
        bt[7].addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        s1 = s;
                                        s += '-';
                                        id = 2;
                                        s2 = "";
                                        tf.setText(s);
                                    }
                                }
        );
        bt[11].addActionListener(new ActionListener() {
                                     public void actionPerformed(ActionEvent e) {
                                         s1 = s;
                                         s += '*';
                                         id = 3;
                                         s2 = "";
                                         tf.setText(s);
                                     }
                                 }
        );
        bt[14].addActionListener(new ActionListener() {
                                     public void actionPerformed(ActionEvent e) {
                                         s = "";
                                         s2 = "";
                                         tf.setText(s);
                                     }
                                 }
        );
        bt[15].addActionListener(new ActionListener() {
                                     public void actionPerformed(ActionEvent e) {
                                         s1 = s;
                                         s += '/';
                                         id = 4;
                                         s2 = "";
                                         tf.setText(s);
                                     }
                                 }
        );
        bt1.addActionListener(new ActionListener() {
                                  public void actionPerformed(ActionEvent e) {
                                      if (id < 1) ;
                                      else {
                                          s += '=';
                                          double a = Double.parseDouble(s1);
                                          double b = Double.parseDouble(s2);
                                          double c = 0;
                                          switch (id) {
                                              case 1:
                                                  c = a + b;
                                                  break;
                                              case 2:
                                                  c = a - b;
                                                  break;
                                              case 3:
                                                  c = a * b;
                                                  break;
                                              case 4:
                                                  c = a / b;
                                                  break;
                                          }
                                          s += c;
                                          tf.setText(s);
                                      }
                                      s = "";
                                      s1 = "";
                                      s2 = "";
                                      id = 0;
                                  }
                              }
        );
        bt2.addActionListener(new ActionListener() {
                                  public void actionPerformed(ActionEvent e) {
                                      char[] c1;
                                      char[] c2 = new char[s.length() - 1];
                                      c1 = s.toCharArray();
                                      for (int i = 0; i < s.length(); i++)
                                          c2[i] = c1[i];
                                      s = s.valueOf(c2);


                                      if (id < 1) {
                                          s1 = s;
                                      }
                                      if (s2.length() >= 1) {
                                          char[] c3;
                                          char[] c4 = new char[s2.length() - 1];
                                          c3 = s2.toCharArray();
                                          for (int i = 0; i < s.length(); i++)
                                              c4[i] = c3[i];
                                          s2 = s2.valueOf(c4);
                                      }
                                      tf.setText(s);
                                  }
                              }
        );
    }
}