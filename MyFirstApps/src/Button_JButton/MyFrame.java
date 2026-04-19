package Button_JButton;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener
{

    JButton button;
    JLabel label;
    MyFrame() {
        ImageIcon icon = new ImageIcon("D:\\User\\Documents\\CodingFiles\\Java\\MyFirstApps\\src\\img_1.png");
        label = new JLabel();
        label.setText("Thanks! :3");
        label.setBounds(650, 300, 100, 100);
        label.setVisible(false);
        this.add(label);

        button = new JButton();
        button.setBounds(125, 100, 500, 500);
        button.addActionListener(this);

        button.setText("Feed me!");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-25);
        button.setForeground(Color.cyan);
        button.setBackground(Color.GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750, 750);
        this.setLayout(null);
        this.setVisible(true);

        this.add(button);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Mmm Tasty");
            label.setVisible(true);
        }
    }
}
