package com.javacourse.chapter30.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;

class MyJMenuBarAndJToolBarClassesFrame extends JFrame implements ActionListener {
    JToolBar tb;
    JButton b1, b2, b3, b4, b5, b6, b7, b8;
    JTextArea ta;

    public MyJMenuBarAndJToolBarClassesFrame(){
        super("Toolbar Demo");

        tb = new JToolBar();

        b1 = new JButton("SAVE");
        b2 = new JButton("OPEN");
        b3 = new JButton("NEW");
        b4 = new JButton("CUT");
        b5 = new JButton("COPY");
        b6 = new JButton("SPLIT");
        b7 = new JButton("CLOSE");
        b8 = new JButton("CHANGE COLOR");

        tb.add(b1);tb.add(b2);tb.add(b3);
        tb.add(new JToolBar.Separator());
        tb.add(b4);tb.add(b5);tb.add(b6);tb.add(b7);tb.add(b8);

        ta = new JTextArea();
        JScrollPane pane = new JScrollPane(ta);

        add(tb, BorderLayout.NORTH);
        add(pane, BorderLayout.CENTER);

        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem m1 = new JMenuItem("save");
        JMenuItem m2 = new JMenuItem("open");
        m2.setMnemonic(KeyEvent.VK_O);

        file.add(m1);
        file.addSeparator();
        file.add(m2);
        mb.add(file);

        setJMenuBar(mb);

        b2.setActionCommand("open");
        b2.addActionListener(this);
        b8.setActionCommand("color");
        b8.addActionListener(this);
        m2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae){

        if(ae.getActionCommand().equals("open")){
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(this);

            File f = fc.getSelectedFile();
            try{
                FileInputStream fileInputStream = new FileInputStream(f);
                byte[] b = new byte[fileInputStream.available()];
                fileInputStream.read(b);

                String str = new String(b);

                ta.setText(str);
                fileInputStream.close();
            }
            catch (Exception e){

            }
        }
        else{
            Color col = JColorChooser.showDialog(this, "Font Color", Color.RED);
            ta.setForeground(col);
        }
    }
}

public class JMenuBarAndJToolBarClasses {
    public static void main(String[] args){
        MyJMenuBarAndJToolBarClassesFrame frame = new MyJMenuBarAndJToolBarClassesFrame();
        frame.setSize(new Dimension(800, 800));
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
