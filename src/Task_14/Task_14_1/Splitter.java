package Task_14.Task_14_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Splitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку для разбиения:");
        String input = scanner.nextLine();

        // Здесь вы можете задать свое регулярное выражение
        String regex = "\\s+"; // Регулярное выражение для разделения по пробелам

        Pattern pattern = Pattern.compile(regex);
        String[] elements = pattern.split(input);

        System.out.println("Элементы после разбиения:");
        for (String element : elements) {
            System.out.println(element);
        }
    }
}








