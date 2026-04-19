package DragDropImage;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
    DragPanel dragPanel = new DragPanel();

    MyFrame(){
        this.add(dragPanel);

        this.setTitle("Drag and drop");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setVisible(true);
    }


}
