package com.javacourse.chapter29.AbstractWindowToolkit;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class PaintingFrame extends Frame{
    int x = 0, y = 0;

    public PaintingFrame(){
        super("Painting");
        addMouseMotionListener(new Handler());
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.setFont(new Font("NoteWorthy", Font.ITALIC, 30));
        g.drawString("Hello", x, y);
    }
    class Handler extends MouseAdapter{
        @Override
        public void mouseMoved(MouseEvent mouseEvent){
            x = mouseEvent.getX();
            y = mouseEvent.getY();
            repaint();
        }
    }
}

public class PaintingUsingAWT {
    public static void main(String[] args){
        PaintingFrame pf = new PaintingFrame();
        pf.setSize(500, 500);
        pf.setVisible(true);
    }
}
