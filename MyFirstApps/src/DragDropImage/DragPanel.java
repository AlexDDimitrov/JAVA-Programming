package DragDropImage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DragPanel extends JPanel {

    ImageIcon icon = new ImageIcon("D:\\User\\Documents\\CodingFiles\\Java\\MyFirstApps\\src\\img_1.png");
    Image scaled = icon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
    ImageIcon finalIcon = new ImageIcon(scaled);

    final int width = finalIcon.getIconWidth();
    final int height = finalIcon.getIconHeight();
    Point imageCorner;
    Point prevPt;

    DragPanel() {
        imageCorner = new Point(0, 0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        finalIcon.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
    }

    private class ClickListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            prevPt = e.getPoint();
        }
    }

    private class DragListener extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent e) {
            Point currentPt = e.getPoint();
            imageCorner.translate((int)(currentPt.getX() -  prevPt.getX()), (int)(currentPt.getY() - prevPt.getY()));
            prevPt = currentPt;
            repaint();
        }


    }
}
