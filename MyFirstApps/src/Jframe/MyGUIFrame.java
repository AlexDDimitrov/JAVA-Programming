package Jframe;

import javax.swing.*;
import java.awt.*;

public class MyGUIFrame extends JFrame {
    MyGUIFrame() {

        this.setTitle("Hello World");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//DO_Nothing_On_Close, Hide_on_close
        this.setResizable(false);
        this.setSize(420, 420);
        this.setVisible(true); // make this visible

        ImageIcon image = new ImageIcon(
                "D:\\User\\Documents\\CodingFiles\\Java\\MyFirstApps\\src\\viber_image_2025-03-27_19-16-01-784.jpg");
        this.setIconImage(image.getImage());

        this.getContentPane().setBackground(new Color(123,50,250));//0xFFFFFF

    }
}
