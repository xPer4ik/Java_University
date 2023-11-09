package Task_15.Task_15_4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Calculator extends JFrame {
    JTextArea jta1 = new JTextArea(1,20);
    JButton button1 = new JButton("7");
    JButton button2 = new JButton("8");
    JButton button3 = new JButton("9");
    JButton button4 = new JButton("/");
    JButton button5 = new JButton("4");
    JButton button6 = new JButton("5");
    JButton button7 = new JButton("6");
    JButton button8 = new JButton("*");
    JButton button9 = new JButton("1");
    JButton button10 = new JButton("2");
    JButton button11 = new JButton("3");
    JButton button12 = new JButton("-");
    JButton button13 = new JButton("0");
    JButton button14 = new JButton(".");
    JButton button15 = new JButton("=");
    JButton button16 = new JButton("+");
    //начало конструктора класса LabExample
    Calculator() {
        super("Example");
        setLayout(new FlowLayout());
        setSize(240, 200);
        add(jta1);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
        add(button10);
        add(button11);
        add(button12);
        add(button13);
        add(button14);
        add(button15);
        add(button16);
        JButton[] numberButtons = { button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button16 };

        for (JButton button : numberButtons) {
            button.addActionListener(e -> jta1.append(button.getText()));
        }

    // Отдельная обработка button16, так как у него специальный комментарий
        button16.addActionListener(e -> jta1.append(button16.getText()));
        button15.addActionListener(new ActionListener() {
            // op =
            public void actionPerformed(ActionEvent e) {
                String str = jta1.getText();
                System.out.println(str);
                String operand1 = "";
                String operand2 = "";
                String operation = "";
                double x1 = 0;
                double x2 = 0;
                String operations = "/*+-";
                for (int i = 0; i < str.length() - 1; i++) {
                    String a = str.substring(i, i + 1);
                    if ((operations.indexOf(a) != -1) && (a != "-" && i != 0)) {
                        operand1 = str.substring(0, i);
                        operation = a;
                        operand2 = str.substring(i + 1, str.length());
                        break;
                    }
                }
                jta1.setText("");
                try {
                    x1 = Double.parseDouble(operand1);
                    x2 = Double.parseDouble(operand2);
                    switch (operation) {
                        case "/":
                            jta1.setText( String.valueOf(x1 / x2));
                            break;
                        case "+":
                            jta1.setText( String.valueOf(x1 + x2));
                            break;
                        case "*":
                            jta1.setText( String.valueOf(x1 * x2));
                            break;
                        case "-":
                            jta1.setText( String.valueOf(x1 - x2));
                            break;
                        default:
                            JOptionPane.showMessageDialog( null, "Error","alert" , JOptionPane.ERROR_MESSAGE);
                            break;
                    }
                }
                catch (Exception exception) {
                    JOptionPane.showMessageDialog( null, "Error","alert" , JOptionPane.ERROR_MESSAGE);
                }
                System.out.println(operand1);
                System.out.println(operation);
                System.out.println(operand2);
            }
        });
    }
    {
        setVisible(true);
    }
    public static void main(String[]args) {
        new Calculator();
    }
} // конец main()
