package com.jie.gui.jframe;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class MYJFrame {
    public static void main(String[] args) {
        new myjframer("JFrame");
    }
}
class myjframer extends JFrame{

    public myjframer(String st){
        super(st);
        setVisible(true);
        JButton JB=new JButton("Hello!");
        setBounds(400,400,600,300);
        JLabel jl=new JLabel("你好呀！~");
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        JPanel P=new JPanel();
        P.add(JB);

        //必须在 容器内 去 操作(必须是当前对象的引用不然  无法覆盖在当前弹窗)
        Container ctp=getContentPane();
        ctp.setBackground(Color.PINK);
        ctp.add(jl);
        //ctp.add(P);
    }
}
