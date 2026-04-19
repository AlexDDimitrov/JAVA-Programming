package KeyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame  extends JFrame implements KeyListener {

    ImageIcon icon = new ImageIcon("D:\\User\\Documents\\CodingFiles\\Java\\MyFirstApps\\src\\img_1.png");
    Image scaled = icon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
    ImageIcon finalIcon = new ImageIcon(scaled);

    JLabel label;
    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        //label.setBackground(Color.red);
        //label.setOpaque(true);

        label.setIcon(finalIcon);
        this.add(label);
        this.getContentPane().setBackground(Color.BLACK);


        this.setLayout(null);
        this.addKeyListener(this);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //invoked when a key is typed
       /* switch (e.getKeyChar()) {
            case 'a': label.setLocation(label.getX()-10, label.getY()); break;
            case 's': label.setLocation(label.getX(), label.getY()+10); break;
            case 'd': label.setLocation(label.getX()+10, label.getY()); break;
            case 'w': label.setLocation(label.getX(), label.getY()-10); break;
        }*/
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //physical key is pressed
        switch (e.getKeyCode()) {
            case 37: label.setLocation(label.getX()-10, label.getY()); break;
            case 40: label.setLocation(label.getX(), label.getY()+10); break;
            case 39: label.setLocation(label.getX()+10, label.getY()); break;
            case 38: label.setLocation(label.getX(), label.getY()-10); break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //when a button is released
        System.out.println("You released: " + e.getKeyChar());
        System.out.println("You released key code: " + e.getKeyCode());
    }
}
