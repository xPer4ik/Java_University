package Task_12.Task_12_2;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Image {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Пожалуйста, укажите путь к изображению в аргументах командной строки.");
            return;
        }

        String imagePath = args[0];

        JFrame frame = new JFrame("Отображение изображения");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            BufferedImage image = ImageIO.read(new File(imagePath));
            JLabel label = new JLabel(new ImageIcon(image));

            frame.add(label);
            frame.pack();
            frame.setVisible(true);
        } catch (IOException e) {
            System.err.println("Ошибка при загрузке изображения: " + e.getMessage());
        }

    }
}
