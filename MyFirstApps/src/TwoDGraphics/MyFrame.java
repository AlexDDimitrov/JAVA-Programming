package TwoDGraphics;

import javax.swing.*;

public class MyFrame extends JFrame {
    Panel panel;

    MyFrame() {
        panel = new Panel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);
        this.pack();

        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }
}
