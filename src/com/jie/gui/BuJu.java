package com.jie.gui;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BuJu {
    public static void main(String[] args) {
            //先布局后add  以及各种嵌套

        //CENTER中间    LEFT左边   RIGHT右边
        Frame frame=new Frame();
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        /*
        布局：
        流式布局：frame.setLayout(new FlowLayout( 形式参数为：左  右 中  ));
        东西南北中布局：frame.setLayout(new BordorLayout( 形式参数为：East东  West西   South南   North北   Center中  ));
        表格布局：frame.setLayout(new GardLayout( 形式参数为：  ));
         */
        frame.setLayout(new GridLayout(2,1));//  rows:排   cols:列

        frame.setVisible(true);

        frame.setBackground(Color.LIGHT_GRAY);

        frame.setBounds(500,500,400,400);


        Panel panel1=new Panel();
        panel1.setLayout(new GridLayout(2,1));
        Button BT1=new Button("BT1");
        Button BT2=new Button("BT2");
        panel1.add(BT1);
        panel1.add(BT2);


        Panel panel2=new Panel();
        panel2.setLayout(new GridLayout(1,3));//align排列
        Button BT3=new Button("BT3");
        Button BT4=new Button("BT4");


        panel2.add(BT3);
        panel2.add(panel1);
        panel2.add(BT4);


        Panel panel3=new Panel();
        panel3.setLayout(new GridLayout(2,2));
        Button BT5=new Button("BT5");
        Button BT6=new Button("BT6");
        Button BT7=new Button("BT7");
        Button BT8=new Button("BT8");


        panel3.add(BT5);
        panel3.add(BT6);
        panel3.add(BT7);
        panel3.add(BT8);


        Panel panel4=new Panel();
        panel4.setLayout(new GridLayout(1,3));//align排列
        Button BT9=new Button("BT9");
        Button BT10=new Button("BT10");


        panel4.add(BT9);
        panel4.add(panel3);
        panel4.add(BT10);

        frame.add(panel2);
        frame.add(panel4);












    }
}
