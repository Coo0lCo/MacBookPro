package com.jie.gui;
import java.awt.*;
public class gui01 {
    public static void main(String[] args) {

        //title顾名思义    此操作为弹窗的出现文字
        Frame fm=new Frame("你好呀");
        fm.setVisible(true);
        //xy初始位置坐标    wh为弹窗大小
        fm.setBounds(100,100,300,300);
        //Color 这个类是创造颜色的
        Color t=new Color(0xF102CA);
        fm.setBackground(t);
        /*
        fm.setBackground(new Color(0x3FE702));
         */
        //弹窗是否可拉伸大小调节
        fm.setResizable(true);

    }
}
