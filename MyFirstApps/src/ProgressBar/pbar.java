package ProgressBar;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class pbar {
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(1, 100);

    pbar() {
        bar.setValue(0);
        bar.setBounds(0, 0, 420, 50);
        bar.setStringPainted(true);
        //bar.setForeground(Color.red);

        frame.add(bar);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 100);
        frame.setLayout(null);
        frame.setVisible(true);

        try {
            fill();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public void fill() throws InterruptedException {
        int counter = 0;
        while(counter<=100) {
            bar.setValue(counter);
            Random random = new Random();
            Thread.sleep(random.nextInt(1, 1000));
            counter+=random.nextInt(10);
        }
        bar.setString("Done");
        Thread.sleep(500);
        frame.dispose();
    }
}
