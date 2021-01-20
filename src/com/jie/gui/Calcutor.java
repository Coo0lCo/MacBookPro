package com.jie.gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calcutor {
    public static void main(String[] args) {
        new mycalcutor();
    }
}
class mycalcutor extends Frame{
    public mycalcutor(){
        TextField t1=new TextField(10);
        TextField t2=new TextField(10);
        TextField t3=new TextField(20);
        setLayout(new FlowLayout());
        Label l1=new Label("+");
        Button l2=new Button("=");
        l2.addActionListener(new ctActionListener(t1,t2,t3));
        add(t1);
        add(l1);
        add(t2);
        add(l2);
        add(t3);
        setVisible(true);
        pack();
    }
}
class ctActionListener implements ActionListener{
    TextField t1,t2,t3;
    public ctActionListener(TextField t1,TextField t2,TextField t3){
        this.t1=t1;
        this.t2=t2;
        this.t3=t3;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //Integer.parseInt   --->将字符串转换成 int 类型的整数；
      int a=Integer.parseInt(t1.getText());
      int b=Integer.parseInt(t2.getText());
      t3.setText(""+(a+b));
      t1.setText("");
      t2.setText("");
    }
}
