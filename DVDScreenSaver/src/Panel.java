import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Panel extends JPanel implements ActionListener{
    Random random = new Random();
    ImageIcon dvd;
    final int WIDTH = 500;
    final int HEIGHT = 500;
    Timer timer;
    int xVelocity = random.nextInt(1, 4);
    int yVelocity = random.nextInt(1, 4);
    int x, y = 0;
    Image finalIcon;

    Panel() {
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.white);
        dvd = new ImageIcon("D:\\User\\Documents\\CodingFiles\\Java\\MyFirstApps\\src\\img_3.png");
        Image scaled = dvd.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        finalIcon = new ImageIcon(scaled).getImage();
        timer = new Timer(10, this);
        timer.start();
    }

    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(finalIcon, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x >= 450 || x < 0) {
            xVelocity = random.nextInt(1, 4);
            if (x >= 450) xVelocity *= -1;
        }
        if (y >= 450 || y < 0) {
            yVelocity = random.nextInt(1, 4);
            if (y >= 450) yVelocity *= -1;
        }

        x += xVelocity;
        y += yVelocity;

        repaint();
    }

}
