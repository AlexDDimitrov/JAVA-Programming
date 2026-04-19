import java.awt.*;

public class Score extends Rectangle {
    static int WIDTH;
    static int HEIGHT;
    int p1;
    int p2;

    Score(int WIDTH, int HEIGHT) {
        Score.WIDTH = WIDTH;
        Score.HEIGHT = HEIGHT;
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.setFont(new Font("Consolas", Font.PLAIN, 60));

        g.drawLine(WIDTH/2, 0, WIDTH/2, HEIGHT);

        g.drawString(String.valueOf(p1/10) + String.valueOf(p1%10), (WIDTH/2)-85, 50);
        g.drawString(String.valueOf(p2/10) + String.valueOf(p2%10), (WIDTH/2)+20, 50);
    }
}
