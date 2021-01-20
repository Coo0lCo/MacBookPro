package com.jie.gui.JPane;

import javax.swing.*;
import java.awt.*;

public class JpaneTest {
    public static void main(String[] args) {
        new myframe04();
    }
}
class myframe04 extends JFrame{
    public myframe04(){
        setVisible(true);
        Container c=this.getContentPane();
        JTextArea t=new JTextArea(20,20);
        t.setText("hello");

        JScrollPane s=new JScrollPane(t);
        c.add(s);


    }
}