package com.jie.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Calendar;

public class Mouse {
    public static void main(String[] args) {
        new mymouselistener();
    }
}
class mymouselistener extends JFrame{

    public mymouselistener(){
        setVisible(true);
        setBounds(300,300,600,400);

        addMouseMotionListener(new mymml());

    }

    class mymml extends MouseMotionAdapter{
        @Override
        public void mouseDragged(MouseEvent e) {

        }
    }
}