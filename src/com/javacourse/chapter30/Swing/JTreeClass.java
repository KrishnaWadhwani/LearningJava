package com.javacourse.chapter30.Swing;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.io.File;
import java.util.StringTokenizer;

class MyJTreeClassFrame extends JFrame implements TreeSelectionListener {
    JTree tree;
    JLabel label;

    public MyJTreeClassFrame(){
        super("Tree Demo");
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("/home/krishna");
        File file = new File("/home/krishna/");

        for(File x: file.listFiles()){
            if (x.isDirectory()){
                DefaultMutableTreeNode folder = new DefaultMutableTreeNode(x.getName());
                for(File y : x.listFiles()){
                    folder.add(new DefaultMutableTreeNode(y.getName()));
                }
                root.add(folder);
            }
            else{
                root.add(new DefaultMutableTreeNode(x.getName()));
            }
        }

        tree = new JTree(root);
        tree.addTreeSelectionListener(this);
        label = new JLabel("No File Selected");

        // scroll bar will be attached to tree
        JScrollPane sp = new JScrollPane(tree);

        add(sp, BorderLayout.CENTER);
        add(label, BorderLayout.SOUTH);
    }

    @Override
    public void valueChanged(TreeSelectionEvent treeSelectionEvent) {
        String name = treeSelectionEvent.getPath().toString();
        name = name.substring(name.lastIndexOf(",") + 1, name.length() - 1);
        label.setText(name.trim());
    }
}

public class JTreeClass {
    public static void main(String[] args){
        MyJTreeClassFrame frame = new MyJTreeClassFrame();
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
