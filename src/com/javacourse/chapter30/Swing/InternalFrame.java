package com.javacourse.chapter30.Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyInternalFrame extends JInternalFrame{
    static int count = 0;
    JTextArea ta;
    JScrollPane sp;

    public MyInternalFrame(){
        super("Document "+(++count), true, true, true, true);

        ta = new JTextArea();
        sp = new JScrollPane(ta);
        add(sp);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem item = new JMenuItem("Save");

        menu.add(item);
        menuBar.add(menu);
        setJMenuBar(menuBar);

        setSize(300, 300);
        setLocation(50, 50);
        setVisible(true);

    }
}

class MyParentFrame extends JFrame implements ActionListener {
    JDesktopPane jp;

    public MyParentFrame(){
        super("Internal Frame Demo");

        jp = new JDesktopPane();
        setContentPane(jp);

        JMenuBar jMenuBar = new JMenuBar();
        JMenu jMenu = new JMenu("Document");
        JMenuItem jMenuItem = new JMenuItem("New");

        jMenu.add(jMenuItem);
        jMenuBar.add(jMenu);
        setJMenuBar(jMenuBar);

        jMenuItem.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        MyInternalFrame mi = new MyInternalFrame();
        jp.add(mi);
    }
}

public class InternalFrame {
    public static void main(String[] args){
        MyParentFrame myParentFrame = new MyParentFrame();
        myParentFrame.setSize(800, 800);
        myParentFrame.setVisible(true);

        myParentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
