package Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem load;
    JMenuItem save;
    JMenuItem exit;
    ImageIcon icon = new ImageIcon("D:\\User\\Documents\\CodingFiles\\Java\\MyFirstApps\\src\\img.png");
    Image scaled = icon.getImage().getScaledInstance(10, 10, Image.SCALE_DEFAULT);
    ImageIcon finalIcon = new ImageIcon(scaled);

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        load = new JMenuItem("Load");
        save = new JMenuItem("Save");
        exit = new JMenuItem("Exit");

        save.setIcon(finalIcon);

        load.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);

        fileMenu.setMnemonic(KeyEvent.VK_F);//alt f for file
        editMenu.setMnemonic(KeyEvent.VK_E);//alt e for edit
        helpMenu.setMnemonic(KeyEvent.VK_H);//alt h for help

        load.setMnemonic(KeyEvent.VK_L);//l for load
        save.setMnemonic(KeyEvent.VK_S);//s for save
        exit.setMnemonic(KeyEvent.VK_E);//e for exit

        fileMenu.add(load);
        fileMenu.add(save);
        fileMenu.add(exit);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        this.setJMenuBar(menuBar);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == load) {
            System.out.println("Load");
        } else if(e.getSource() == save) {
            System.out.println("Save");
        } else if (e.getSource() == exit) {
            System.exit(0);
        }

    }
}
