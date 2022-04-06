package com.javacourse.chapter29.AbstractWindowToolkit;

import java.awt.*;

class AnimationFrame extends Frame implements Runnable{
    int x = 100, y = 100, tx = 1, ty = 1;
    public AnimationFrame(){
        super("Animation");
        Thread t = new Thread(this);
        t.start();
    }
    @Override
    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.fillOval(x, y, 50, 50);
    }

    @Override
    public void run() {
        while (true){
            x+=tx;
            y+=ty;
            if (x<0 || x>450){
                tx*=-1;
            }
            if (y<20 || y>350){
                ty*=-1;
            }
            repaint();
            try{
                Thread.sleep(5);
            }
            catch (InterruptedException ie){}
        }
    }
}

public class Animation {
    public static void main(String[] args){
        AnimationFrame animationFrame = new AnimationFrame();
        animationFrame.setSize(500, 400);
        animationFrame.setVisible(true);
    }
}
