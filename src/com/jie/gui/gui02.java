package com.jie.gui;
import java.awt.*;
public class gui02 {
    public static void main(String[] args) {
new frametest(00,100,400,400,Color.BLUE);
   new frametest(400,100,400,400,Color.CYAN);
      new frametest(100,400,400,400,Color.darkGray);
       new frametest(400,400,400,400,Color.LIGHT_GRAY);
    }
}



class frametest extends Frame{
    static int cishu=0;
    public frametest(int x,int y,int w,int h,Color color){
        super("ni hao ");
        setBounds(x,y,w,h);
        setVisible(true);
        setBackground(color);
        setResizable(true);
    }





}