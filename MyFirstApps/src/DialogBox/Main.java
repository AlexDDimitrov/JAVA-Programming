package DialogBox;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*JOptionPane.showMessageDialog(null, "This is some info",
                "title", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is some info",
                "title", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is some info",
                "title", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is some info",
                "title", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is some info",
                "title", JOptionPane.ERROR_MESSAGE);

        System.out.println( JOptionPane.showConfirmDialog(null, "Enter something", "title", JOptionPane.YES_NO_CANCEL_OPTION));

        String name = JOptionPane.showInputDialog("Name?");
        System.out.println(name);*/

        ImageIcon icon = new ImageIcon("D:\\User\\Documents\\CodingFiles\\Java\\MyFirstApps\\src\\img_1.png");
        String[] responces = {"hi", "meew", "meoww"};

        JOptionPane.showOptionDialog(null, "hi", "title", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,
                icon, responces, 0);
        /*while(true) {
            JOptionPane.showMessageDialog(null, "VIRUS ON BOARD",
                    "title", JOptionPane.WARNING_MESSAGE);
        }*/
    }
}
