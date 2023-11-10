package Task_16.Task_16_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

public class PasswordChecker extends JFrame {

    private final JTextField serviceField;
    private final JTextField usernameField;
    private final JPasswordField passwordField;
    private final JLabel resultLabel; // Добавленный JLabel

    private final Map<String, String> userPasswordMap;

    public PasswordChecker() {
        userPasswordMap = new HashMap<>();
        userPasswordMap.put("user1", "password1");
        userPasswordMap.put("user2", "password2");
        userPasswordMap.put("user3", "password3");

        setLayout(new GridLayout(4, 2));

        JLabel serviceLabel = new JLabel("Service:");
        serviceField = new JTextField();
        add(serviceLabel);
        add(serviceField);

        JLabel usernameLabel = new JLabel("User name:");
        usernameField = new JTextField();
        add(usernameLabel);
        add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        add(passwordLabel);
        add(passwordField);

        // Добавленный JLabel для вывода результата
        resultLabel = new JLabel(" ");
        add(new JLabel()); // Пустая метка для выравнивания
        add(resultLabel);

        passwordField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                checkPassword();
            }
        });

        setTitle("Password Checker");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void checkPassword() {
        String service = serviceField.getText();
        String username = usernameField.getText();
        char[] passwordChars = passwordField.getPassword();
        String password = new String(passwordChars);

        if (isValidPassword(username, password)) {
            resultLabel.setText("Password is correct!");
            resultLabel.setForeground(Color.GREEN);
        } else {
            resultLabel.setText("Incorrect password. Try again.");
            resultLabel.setForeground(Color.RED);
        }
    }

    private boolean isValidPassword(String username, String password) {
        return userPasswordMap.containsKey(username) && userPasswordMap.get(username).equals(password);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PasswordChecker passwordChecker = new PasswordChecker();
            passwordChecker.setVisible(true);
        });
    }
}