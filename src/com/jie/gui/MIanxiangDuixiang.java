package com.jie.gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MIanxiangDuixiang {
    public static void main(String[] args) {
        new myframe01();
    }
}
class myframe01 extends Frame{
    TextField t1=new TextField(10);
    TextField t2=new TextField(10);
    TextField t3=new TextField(20);
    public myframe01(){
        Label lb=new Label("+");
        Button bt=new Button("=");
        bt.addActionListener(new myActionListener01(this));
        setLayout(new FlowLayout());
        add(t1);
        add(lb);
        add(t2);
        add(bt);
        add(t3);
        setVisible(true);
        pack();
    }
}
class myActionListener01 implements ActionListener{
    myframe01 t=null;
    public myActionListener01(myframe01 t){
        this.t=t;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int a=Integer.parseInt(t.t1.getText());
        int b=Integer.parseInt(t.t2.getText());
        t.t3.setText(""+(a+b));
        t.t1.setText("");
        t.t2.setText("");
    }
}