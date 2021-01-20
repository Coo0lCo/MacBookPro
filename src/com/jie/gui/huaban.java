package com.jie.gui;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;

public class huaban {
    public static void main(String[] args) {
        new myFrame("一起来画画吧！！");
    }
}

class myFrame extends Frame{
    ArrayList al;

    public myFrame(String str){
        super(str);
        setVisible(true);
        setBounds(500,500,600,700);
        this.addMouseListener(new mymouselistener());
        al=new ArrayList<>();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    @Override
    public void paint(Graphics g) {
        //画画，
        Iterator it=al.iterator();

        while (it.hasNext()){
            Point p= (Point) it.next();
            g.setColor(Color.MAGENTA);
            g.fillOval(p.x,p.y,10,10);
        }
    }
    public void addpaint(Point point){
        al.add(point);
    }

    class mymouselistener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            //获取监听鼠标的点击信息并且放入窗口中 ，此时并未发生绘图。
            myFrame mf= (myFrame) e.getSource();
            //创建一个Point对象  向里面传了一个鼠标点击的坐标。（为画图做点提供位置信息）
            //具体怎么传递这个坐标通过
            mf.addpaint(new Point(e.getX(),e.getY()));
            mf.repaint();
        }
    }



}



