package com.javacourse.TestFiles;

//import require classes and packages
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.io.FileReader;
import java.util.Arrays;

//Extends JPanel class
public class Test10 extends JPanel{
    //initialize coordinates
    static int[] cord;
    int marg = 60;


    // this method is written by me except this, this whole program is copied :-)
    public static void setCords(){
        int t;
        try{
            int count = 0;
            FileReader reader = new FileReader("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/TestFiles/Average.txt");
            while ((t = reader.read())!=-1){
                if ((char)t == '\n'){
                    count++;
                }
            }
            cord = new int[count];
            String currentNumber = "";
            int i = 0;
            reader.close();
            FileReader reader1 = new FileReader("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/TestFiles/Average.txt");
            while ((t = reader1.read())!=-1) {
                if ((char)t=='\n'){
                    cord[i] = Integer.parseInt(currentNumber);
                    currentNumber = "";
                    i++;
                }
                else{
                    currentNumber+=(char)t;
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    protected void paintComponent(Graphics grf){
        //create instance of the Graphics to use its methods
        super.paintComponent(grf);
        Graphics2D graph = (Graphics2D)grf;

        //Sets the value of a single preference for the rendering algorithms.
        graph.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // get width and height
        int width = getWidth();
        int height = getHeight();

        // draw graph
        graph.draw(new Line2D.Double(marg, marg, marg, height-marg));
        graph.draw(new Line2D.Double(marg, height-marg, width-marg, height-marg));

        //find value of x and scale to plot points
        double x = (double)(width-2*marg)/(cord.length-1);
        double scale = (double)(height-2*marg)/getMax();

        //set color for points
        graph.setPaint(Color.RED);

        // set points to the graph
        for(int i=0; i<cord.length; i++){
            double x1 = marg+i*x;
            double y1 = height-marg-scale*cord[i];
            graph.fill(new Ellipse2D.Double(x1-2, y1-2, 4, 4));
        }
    }

    //create getMax() method to find maximum value
    private int getMax(){
        int max = -Integer.MAX_VALUE;
        for(int i=0; i<cord.length; i++){
            if(cord[i]>max)
                max = cord[i];

        }
        return max;
    }

    //main() method start
    public static void main(String args[]){
        setCords();
        //create an instance of JFrame class
        JFrame frame = new JFrame();
        // set size, layout and location for frame.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Test10());
        frame.setSize(400, 400);
        frame.setLocation(200, 200);
        frame.setVisible(true);
    }
}