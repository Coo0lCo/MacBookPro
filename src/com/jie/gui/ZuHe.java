package com.jie.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ZuHe {
    public static void main(String[] args) {
        new Mycalcutor();
    }
}
class Mycalcutor extends Frame{
    TextField t1=new TextField(10);
    TextField t2=new TextField(10);
    TextField t3=new TextField(20);
    public Mycalcutor(){
        Label lb=new Label("+");
        Button bt=new Button("=");
        bt.addActionListener(new myActionlistener());
        setLayout(new FlowLayout());
        add(t1);
        add(lb);
        add(t2);
        add(bt);
        add(t3);
        setVisible(true);
        pack();
        addWindowListener(new WindowAdapter() {
            @Overide
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
     class myActionlistener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            t3.setText(""+(a+b));
        }
    }
}