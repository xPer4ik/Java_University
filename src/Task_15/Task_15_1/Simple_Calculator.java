package Task_15.Task_15_1;

import java.awt.*;
import javax.swing.*;

class Simple_Calculator extends JFrame {
    JTextField jta1 = new JTextField(5);
    JTextField jta2 = new JTextField(10);
    JButton button = new JButton("+");
    JButton button1 = new JButton("-");
    JButton button2 = new JButton("*");
    JButton button3 = new JButton("/");

    Simple_Calculator() {
        super("Calculator");
        setLayout(new GridLayout(4, 2)); // Используем GridLayout с 4 строками и 2 столбцами
        setSize(700, 400);

        add(new JLabel("1st Number"));
        add(jta1);
        add(new JLabel("2nd Number"));
        add(jta2);
        add(button);
        add(button1);
        add(button2);
        add(button3);
        button.addActionListener(e -> performOperation("+"));
        button1.addActionListener(e -> performOperation("-"));
        button2.addActionListener(e -> performOperation("*"));
        button3.addActionListener(e -> performOperation("/"));


        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void performOperation(String operation) {
        try {
            double x1 = Double.parseDouble(jta1.getText().trim());
            double x2 = Double.parseDouble(jta2.getText().trim());
            double result = switch (operation) {
                case "+" -> x1 + x2;
                case "-" -> x1 - x2;
                case "*" -> x1 * x2;
                case "/" -> x1 / x2;
                default -> 0;
            };

            JOptionPane.showMessageDialog(null, "Result = " + result, "Alert", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "Error in Numbers!", "Alert", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void main(String[] args) {
        new Simple_Calculator();
    }
}