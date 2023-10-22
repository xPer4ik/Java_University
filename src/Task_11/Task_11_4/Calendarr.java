package Task_11.Task_11_4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Calendarr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод года, месяца, числа, часов и минут
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        System.out.print("Введите месяц (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Введите число (1-31): ");
        int day = scanner.nextInt();
        System.out.print("Введите часы (0-23): ");
        int hours = scanner.nextInt();
        System.out.print("Введите минуты (0-59): ");
        int minutes = scanner.nextInt();

        scanner.close();

        // Делает Date из введенных данных
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String dateString = String.format("%04d-%02d-%02d %02d:%02d", year, month, day, hours, minutes);

        try {
            Date date = dateFormat.parse(dateString);
            System.out.println("Создан объект Date: " + date);
        } catch (Exception e) {
            System.out.println("Ошибка в формате ввода для объекта Date.");
        }

        // Создание календаря
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, hours, minutes);

        System.out.println("Создан объект Calendar: " + calendar.getTime());
    }
}