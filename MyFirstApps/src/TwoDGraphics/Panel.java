package TwoDGraphics;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    Image image;

    Panel() {
        this.setPreferredSize(new Dimension(500, 500));
    }

    public void paint(Graphics g) {
        image = new ImageIcon("D:\\User\\Documents\\CodingFiles\\Java\\MyFirstApps\\src\\img_1.png").getImage();
        Graphics2D g2d = (Graphics2D) g;

        g2d.setPaint(Color.BLUE);
        g2d.setStroke(new BasicStroke(5));
        g2d.drawLine(0, 0, 500, 500);
        //g2d.drawRect(0, 0, 100, 200);
        g2d.setPaint(Color.pink);
        g2d.fillRect(0, 0, 100, 200);
        g2d.setPaint(Color.yellow);
        g2d.drawOval(250, 250, 100, 100);
        g2d.setPaint(Color.RED);
        g2d.drawArc(250, 250, 100, 100, 0, 30);
        g2d.setPaint(Color.GREEN);
        g2d.drawArc(250, 250, 100, 100, 30, 173);
        g2d.drawString("Win", 50, 50);

        g2d.drawImage(image,325, 34, Color.red, null);

    }
}
