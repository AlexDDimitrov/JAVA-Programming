package CheckBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JCheckBox checkBox;
    ImageIcon x;
    ImageIcon v;


    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        x = new ImageIcon("D:\\User\\Documents\\CodingFiles\\Java\\MyFirstApps\\src\\img_4.png");
        v = new ImageIcon("D:\\User\\Documents\\CodingFiles\\Java\\MyFirstApps\\src\\img_2.png");

        Image scaledV = v.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon finalIcon = new ImageIcon(scaledV);

        Image scaledX = x.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon finalIconX = new ImageIcon(scaledX);



        button = new JButton();
        button.setText("Submit");
        button.addActionListener(this);
        this.add(button);

        checkBox = new JCheckBox();
        checkBox.setText("I am not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));
        checkBox.setIcon(finalIconX);
        checkBox.setSelectedIcon(finalIcon);

        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println(checkBox.isSelected());
        }
    }
}
