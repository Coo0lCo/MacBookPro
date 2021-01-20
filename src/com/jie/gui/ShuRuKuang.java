package com.jie.gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ShuRuKuang {
    public static void main(String[] args) {
        new ymframe();
    }
}
class ymframe extends Frame{
    public  ymframe(){
        TextField text=new TextField();
        text.setEchoChar('*');
        add(text);

        text.addActionListener(new MyActioinlistener());
        setVisible(true);
        pack();
    }
}
class MyActioinlistener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        //向下转型
        TextField t=(TextField) e.getSource();
        System.out.print( t.getText());
        //替换编码
        t.setText("");

    }
}