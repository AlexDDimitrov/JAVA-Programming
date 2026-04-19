package ComboBOxes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JComboBox combo;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog", "cat", "bird"};
        combo = new JComboBox(animals);

        combo.addActionListener(this);
        this.add(combo);
        //combo.setEditable(true);
        //System.out.println(combo.getItemCount());
        combo.addItem("horse");
        //.InsertItemAt("hi", 2)
        //.remove()
        //.removeItemAt();
        //.removeAllItems();

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == combo) {
            System.out.println(combo.getSelectedItem());
        }
    }
}
