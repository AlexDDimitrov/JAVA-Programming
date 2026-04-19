import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Calculator extends JFrame {

    private final int boardWidth = 360;
    private final int boardHeight = 540;

    private final Color customLightGray = new Color(212, 212, 210);
    private final Color customDarkGray = new Color(80, 80, 80);
    private final Color customBlack = new Color(28, 28, 28);
    private final Color customOrange = new Color(255, 149, 0);

    private final String[] buttonValues = {
            "AC", "+/-", "%", "÷",
            "7", "8", "9", "×",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "0", ".", "√", "="
    };

    private final String[] rightSymbols = {"÷", "×", "-", "+", "=", "√"};
    private final String[] topSymbols = {"AC", "+/-", "%"};

    private JLabel displayLabel = new JLabel();
    private JPanel displayPanel = new JPanel();
    private JPanel buttonsPanel = new JPanel();

    private String A = "0";
    private String operator = null;
    private String B = null;

    public Calculator() {
        setupFrame();
        setupDisplay();
        setupButtons();
        this.setVisible(true);
    }

    private void setupFrame() {
        this.setSize(boardWidth, boardHeight);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setTitle("Calculator");
    }

    private void setupDisplay() {
        displayLabel.setBackground(customBlack);
        displayLabel.setForeground(Color.white);
        displayLabel.setFont(new Font("Arial", Font.PLAIN, 80));
        displayLabel.setHorizontalAlignment(JLabel.RIGHT);
        displayLabel.setText("0");
        displayLabel.setOpaque(true);

        displayPanel.setLayout(new BorderLayout());
        displayPanel.add(displayLabel);
        this.add(displayPanel, BorderLayout.NORTH);
    }

    private void setupButtons() {
        buttonsPanel.setLayout(new GridLayout(5, 4));
        buttonsPanel.setBackground(customBlack);
        this.add(buttonsPanel);

        for (String value : buttonValues) {
            JButton button = createButton(value);
            buttonsPanel.add(button);
        }
    }

    private JButton createButton(String value) {
        JButton button = new JButton(value);
        button.setFont(new Font("Arial", Font.PLAIN, 30));
        button.setFocusable(false);
        button.setBorder(new LineBorder(customBlack));

        if (Arrays.asList(topSymbols).contains(value)) {
            button.setBackground(customLightGray);
            button.setForeground(customBlack);
        } else if (Arrays.asList(rightSymbols).contains(value)) {
            button.setBackground(customOrange);
            button.setForeground(Color.white);
        } else {
            button.setBackground(customDarkGray);
            button.setForeground(Color.white);
        }

        button.addActionListener(e -> handleButtonPress(value));
        return button;
    }

    private void handleButtonPress(String value) {

        if (Arrays.asList(rightSymbols).contains(value)) {
            handleOperator(value);
        } else if (Arrays.asList(topSymbols).contains(value)) {
            handleTopFunction(value);
        } else {
            handleNumberInput(value);
        }
    }

    private void handleOperator(String value) {

        if (value.equals("√")) {
            double num = Double.parseDouble(displayLabel.getText());
            displayLabel.setText(removeZeroDecimal(Math.sqrt(num)));
        }
        else if (value.equals("=")) {
            if (A != null && operator != null) {
                B = displayLabel.getText();
                double numA = Double.parseDouble(A);
                double numB = Double.parseDouble(B);

                switch (operator) {
                    case "+" -> displayLabel.setText(removeZeroDecimal(numA + numB));
                    case "-" -> displayLabel.setText(removeZeroDecimal(numA - numB));
                    case "×" -> displayLabel.setText(removeZeroDecimal(numA * numB));
                    case "÷" -> displayLabel.setText(removeZeroDecimal(numA / numB));
                }

                clearAll();
            }
        }
        else {
            if (operator == null) {
                A = displayLabel.getText();
                displayLabel.setText("0");
            }
            operator = value;
        }
    }

    private void handleTopFunction(String value) {
        switch (value) {
            case "AC" -> {
                clearAll();
                displayLabel.setText("0");
            }
            case "+/-" -> {
                double num = Double.parseDouble(displayLabel.getText());
                displayLabel.setText(removeZeroDecimal(num * -1));
            }
            case "%" -> {
                double num = Double.parseDouble(displayLabel.getText());
                displayLabel.setText(removeZeroDecimal(num / 100));
            }
        }
    }

    private void handleNumberInput(String value) {
        if (value.equals(".")) {
            if (!displayLabel.getText().contains(".")) {
                displayLabel.setText(displayLabel.getText() + ".");
            }
        } else { // digits
            if (displayLabel.getText().equals("0")) {
                displayLabel.setText(value);
            } else {
                displayLabel.setText(displayLabel.getText() + value);
            }
        }
    }

    private void clearAll() {
        A = "0";
        operator = null;
        B = null;
    }

    private String removeZeroDecimal(double num) {
        return (num % 1 == 0)
                ? Integer.toString((int) num)
                : Double.toString(num);
    }
}
