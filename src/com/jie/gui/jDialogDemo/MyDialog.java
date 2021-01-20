package com.jie.gui.jDialogDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyDialog {
    public static void main(String[] args) {
        new vmydialog("欢迎你呀！！");
    }
}
class vmydialog extends JFrame{

    public vmydialog(String s){
        super(s);
        this.setBounds(400,400,600,300);
        this.setVisible(true);
        JButton JB=new JButton("点击我吧！~");
        JB.setBounds(30,30,200,100);

        Container container=getContentPane();

        //绝对布局！
        container.setLayout(null);
        container.add(JB);

        JB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new mydialog01();
            }
        });
    }
}
class mydialog01 extends JDialog{

       public mydialog01(){
           this.setVisible(true);
            this.setBounds(300,300,400,200);
            Container C=this.getContentPane();
            JLabel L=new JLabel("我真的很感激这个世界有你哟");
            //此方法用于将 添加内容 放置与弹窗中央位置
            L.setHorizontalAlignment(SwingConstants.CENTER);
            C.add(L);


       }
}