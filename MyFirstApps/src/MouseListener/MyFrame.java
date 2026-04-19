package MouseListener;

import OpenNewWindow.LaunchPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame  extends JFrame implements MouseListener {
    JLabel label;

    MyFrame(){
        label = new JLabel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.addMouseListener(this);
        this.add(label);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //invoked when a mouse button is clicked
        System.out.println("Click!");

    }

    @Override
    public void mousePressed(MouseEvent e) {
        //invoked when a mouse button is pressed
        System.out.println("Press!");
        label.setBackground(Color.yellow);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //invoked when a mouse button releases
        System.out.println("Release!");
        label.setBackground(Color.green);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //invoked when the mouse exits a component
        System.out.println("Entered label!");
        label.setBackground(Color.blue);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Exited label!");
        label.setBackground(Color.red);
    }
}
