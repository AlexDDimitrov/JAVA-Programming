package KeyBindings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game {
    JLabel label;
    JFrame frame;

    Action up;
    Action down;
    Action left;
    Action right;
    Game() {
        frame = new JFrame("Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);

        label = new JLabel();
        label.setBackground(Color.red);
        label.setBounds(100, 100, 100, 100);
        label.setOpaque(true);

        up = new Up();
        down = new Down();
        left = new Left();
        right = new Right();

        label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAct");//'w'
        label.getActionMap().put("upAct", up);
        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAct");
        label.getActionMap().put("downAct", down);
        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAct");
        label.getActionMap().put("leftAct", left);
        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAct");
        label.getActionMap().put("rightAct", right);

        frame.add(label);
        frame.setVisible(true);
    }

    public class Up extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() - 10);
        }
    }

    public class Down extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() + 10);
        }
    }

    public class Left extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() - 10, label.getY());
        }
    }

    public class Right extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() + 10, label.getY());
        }
    }
}
