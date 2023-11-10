package Task_16.Task_16_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor extends JFrame {
    private JTextArea textArea;

    public TextEditor() {
        setTitle("Text Editor");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создание JTextArea
        textArea = new JTextArea();
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(textArea);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Создание меню для выбора цвета
        JMenu colorMenu = new JMenu("Цвет");
        JMenuItem blueItem = new JMenuItem("Синий");
        JMenuItem redItem = new JMenuItem("Красный");
        JMenuItem blackItem = new JMenuItem("Черный");

        blueItem.addActionListener(new ColorMenuItemListener(Color.BLUE));
        redItem.addActionListener(new ColorMenuItemListener(Color.RED));
        blackItem.addActionListener(new ColorMenuItemListener(Color.BLACK));

        colorMenu.add(blueItem);
        colorMenu.add(redItem);
        colorMenu.add(blackItem);

        // Создание меню для выбора шрифта
        JMenu fontMenu = new JMenu("Шрифт");
        JMenuItem timesNewRomanItem = new JMenuItem("Times New Roman");
        JMenuItem msSansSerifItem = new JMenuItem("MS Sans Serif");
        JMenuItem courierNewItem = new JMenuItem("Courier New");

        timesNewRomanItem.addActionListener(new FontMenuItemListener("Times New Roman"));
        msSansSerifItem.addActionListener(new FontMenuItemListener("MS Sans Serif"));
        courierNewItem.addActionListener(new FontMenuItemListener("Courier New"));

        fontMenu.add(timesNewRomanItem);
        fontMenu.add(msSansSerifItem);
        fontMenu.add(courierNewItem);

        // Меню для выбора размера шрифта
        JMenu sizeMenu = new JMenu("Размер шрифта");
        JMenuItem size12Item = new JMenuItem("12");
        JMenuItem size16Item = new JMenuItem("16");
        JMenuItem size20Item = new JMenuItem("20");

        size12Item.addActionListener(new SizeMenuItemListener(12));
        size16Item.addActionListener(new SizeMenuItemListener(16));
        size20Item.addActionListener(new SizeMenuItemListener(20));

        sizeMenu.add(size12Item);
        sizeMenu.add(size16Item);
        sizeMenu.add(size20Item);

        // Создание главного меню
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(colorMenu);
        menuBar.add(fontMenu);
        menuBar.add(sizeMenu);
        setJMenuBar(menuBar);

        setVisible(true);
    }

    private class ColorMenuItemListener implements ActionListener {
        private Color color;

        public ColorMenuItemListener(Color color) {
            this.color = color;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.setForeground(color);
        }
    }

    private class FontMenuItemListener implements ActionListener {
        private String fontName;

        public FontMenuItemListener(String fontName) {
            this.fontName = fontName;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.setFont(new Font(fontName, Font.PLAIN, textArea.getFont().getSize()));
        }
    }

    private class SizeMenuItemListener implements ActionListener {
        private int fontSize;

        public SizeMenuItemListener(int fontSize) {
            this.fontSize = fontSize;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.setFont(new Font(textArea.getFont().getFamily(), Font.PLAIN, fontSize));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TextEditor());
    }
}