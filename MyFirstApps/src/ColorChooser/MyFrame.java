package ColorChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Pick a color");
        label = new JLabel("Text");
        label.setFont(new Font("MV Boli", Font.PLAIN, 50));
        label.setBackground(Color.white);
        label.setOpaque(true);
        button.addActionListener(this);
        this.add(button);
        this.add(label);


        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null, "Pick a color", Color.black);
            //label.setForeground(color);
            label.setBackground(color);
        }
    }
}
