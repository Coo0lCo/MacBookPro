package com.jie.gui.HuaHua;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Huaxiantiao {
    public static void main(String[] args) {
        new myhuabanya("一起来画画吧！！~~");
    }
}
class myhuabanya extends JFrame{
    myhuabanya m=this;
    public  myhuabanya(String s){
        super(s);
        setVisible(true);
        setBounds(300,300,1500,800);


        Container c=getContentPane();
        c.setBackground(Color.white);
        c.setLayout(null);

        JButton jb1=new JButton("Black");
        jb1.setBounds(100,0,100,50);
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              m.addMouseMotionListener(new Mymousemotionlistener1());
            }
        });
        add(jb1);
        JButton jb2=new JButton("Gules");
        jb2.setBounds(200,0,100,50);
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m.addMouseMotionListener(new Mymousemotionlistener2());
            }
        });
        add(jb2);
        JButton jb3=new JButton("Green");
        jb3.setBounds(300,0,100,50);
        jb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m.addMouseMotionListener(new Mymousemotionlistener3());
            }
        });
        add(jb3);

        JButton jb4=new JButton("Yellow");
        jb4.setBounds(400,0,100,50);
        jb4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m.addMouseMotionListener(new Mymousemotionlistener4());
            }
        });
        add(jb4);

        JButton jb6=new JButton("MAGENTA");
        jb6.setBounds(500,0,100,50);
        jb6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m.addMouseMotionListener(new Mymousemotionlistener5());
            }
        });
        add(jb6);
//---------------------------------------------------------------------------------------------
        JButton jb7=new JButton("啥颜色？");
        jb7.setBounds(600,0,100,50);
        jb7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m.addMouseMotionListener(new Mymousemotionlistener6());
            }
        });
        add(jb7);

        JButton jb8=new JButton("cyan&green");
        jb8.setBounds(700,0,100,50);
        jb8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m.addMouseMotionListener(new Mymousemotionlistener7());
            }
        });
        add(jb8);
        JButton jb9=new JButton("blue");
        jb9.setBounds(800,0,100,50);
        jb9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m.addMouseMotionListener(new Mymousemotionlistener8());
            }
        });
        add(jb9);
        JButton jb10=new JButton("cyan");
        jb10.setBounds(900,0,100,50);
        jb10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m.addMouseMotionListener(new Mymousemotionlistener9());
            }
        });
        add(jb10);
        JButton jb11=new JButton("PINK");
        jb11.setBounds(1000,0,100,50);
        jb11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m.addMouseMotionListener(new Mymousemotionlistener10());
            }
        });
        add(jb11);
        //--------------------------------------------------------------------------
        JButton jb5=new JButton("清空");
        jb5.setBounds(0,350,80,100);
        jb5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m.setBackground(Color.white);
                m.repaint();
            }
        });
        add(jb5);

        JButton jb12=new JButton("橡皮擦");
        jb12.setBounds(0,500,100,50);
        jb12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m.addMouseMotionListener(new MymousemotionlistenerXPC());
            }
        });
        add(jb12);

    }


    class Mymousemotionlistener1 extends MouseMotionAdapter{

        @Override
        //鼠标***拖动
        public void mouseDragged(MouseEvent e) {
            m.getGraphics().fillOval(e.getX(),e.getY(),20,20);
        }

    }
    class Mymousemotionlistener2 extends MouseMotionAdapter{

        @Override
        //鼠标***拖动
        public void mouseDragged(MouseEvent e) {
            Graphics g=m.getGraphics();
            g.setColor(Color.red);
            g.fillOval(e.getX(),e.getY(),20,20);

        }
    }
    class Mymousemotionlistener3 extends MouseMotionAdapter{

        @Override
        //鼠标***拖动
        public void mouseDragged(MouseEvent e) {
            Graphics g=m.getGraphics();
            g.setColor(Color.green);
            g.fillOval(e.getX(),e.getY(),20,20);
        }

    }
    class Mymousemotionlistener4 extends MouseMotionAdapter{

        @Override
        //鼠标***拖动
        public void mouseDragged(MouseEvent e) {
            Graphics g=m.getGraphics();
            g.setColor(Color.yellow);
            g.fillOval(e.getX(),e.getY(),20,20);
        }

    }
    class Mymousemotionlistener5 extends MouseMotionAdapter{

        @Override
        //鼠标***拖动
        public void mouseDragged(MouseEvent e) {
            Graphics g=m.getGraphics();
            g.setColor(Color.MAGENTA);
            g.fillOval(e.getX(),e.getY(),20,20);

        }

    }
    //----------------------------------------------------------------------
    class Mymousemotionlistener6 extends MouseMotionAdapter{
        @Override
        //鼠标***拖动
        public void mouseDragged(MouseEvent e) {
            Graphics g=m.getGraphics();
            g.setColor(new Color(8, 201, 226));
            g.fillOval(e.getX(),e.getY(),20,20);
        }

    }
    class Mymousemotionlistener7 extends MouseMotionAdapter{

        @Override
        //鼠标***拖动
        public void mouseDragged(MouseEvent e) {
            Graphics g=m.getGraphics();
            g.setColor(new Color(10, 238, 85));
            g.fillOval(e.getX(),e.getY(),20,20);
        }

    }
    class Mymousemotionlistener8 extends MouseMotionAdapter{

        @Override
        //鼠标***拖动
        public void mouseDragged(MouseEvent e) {
            Graphics g=m.getGraphics();
            g.setColor(Color.BLUE);
            g.fillOval(e.getX(),e.getY(),20,20);
        }

    }
    class Mymousemotionlistener9 extends MouseMotionAdapter{

        @Override
        //鼠标***拖动
        public void mouseDragged(MouseEvent e) {
            Graphics g=m.getGraphics();
            g.setColor(Color.cyan);
            g.fillOval(e.getX(),e.getY(),20,20);
        }

    }
    class Mymousemotionlistener10 extends MouseMotionAdapter{

        @Override
        //鼠标***拖动
        public void mouseDragged(MouseEvent e) {
            Graphics g=m.getGraphics();
            g.setColor(Color.PINK);
            g.fillOval(e.getX(),e.getY(),20,20);
        }

    }
    class MymousemotionlistenerXPC extends MouseMotionAdapter{

        @Override
        //鼠标***拖动
        public void mouseDragged(MouseEvent e) {
            Graphics g=m.getGraphics();
            g.setColor(Color.white);
            g.fillOval(e.getX(),e.getY(),20,20);
        }

    }
    //----------------------------------------------------------------------
}


