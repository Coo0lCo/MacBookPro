package com.jie.gui.jDialogDemo;

import javax.swing.*;
import java.awt.*;

public class buttion {
    public static void main(String[] args) {
        new mybuttion();
    }
}
class mybuttion extends JFrame{
    public mybuttion(){
        setVisible(true);
        setBounds(100,100,400,500);
        JButton j=new JButton("222");

        Container c=getContentPane();



        c.add(j);
    }


}