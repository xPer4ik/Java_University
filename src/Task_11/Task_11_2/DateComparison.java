package Task_11.Task_11_2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateComparison {
    public static void main(String[] args) {
        // Получение текущей даты
        LocalDate currentDate = LocalDate.now();

        // Запрос ввода даты от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату в формате dd.MM.yyyy (например, 22.10.2023): ");
        String userDateInput = scanner.nextLine();
        scanner.close();

        // Пользовательский ввод
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        try {
            LocalDate userDate = LocalDate.parse(userDateInput, dateFormat);

            // Сравнение дат
            if (userDate.isBefore(currentDate)) {
                System.out.println("Введенная дата меньше текущей даты.");
            } else if (userDate.isAfter(currentDate)) {
                System.out.println("Введенная дата больше текущей даты.");
            } else {
                System.out.println("Введенная дата совпадает с текущей датой.");
            }
        } catch (Exception e) {
            System.out.println("Ошибка в формате ввода даты.");
        }
    }
}