package Task_1;

import java.util.Scanner;

public class task {

    public static void main(String[] args) { // Точка входа в программу
        //first();         // Вызов первой задачи
        //second();        // Вызов второй задачи
        third(args);     // Вызов третьей задачи с аргументами командной строки
        //fourth();        // Вызов четвертой задачи
        //System.out.println(fifth(5)); // Вызов пятой задачи и вывод результата
    }

    public static void first() { // Первая задача: Вычисление суммы и среднего значения чисел
        Scanner scanner = new Scanner(System.in);
        float counter = 0;
        System.out.println("How many numbers?");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Считываем n чисел с клавиатуры и сохраняем их в массив
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            arr[i] = x;
            counter += x; // Увеличиваем счетчик суммы
        }
        System.out.println("Сумма:" + counter);
        System.out.println("Среднее:" + counter / n); // Выводим сумму и среднее значение
    }

    public static void second() { // Вторая задача: Вычисление суммы, максимума и минимума чисел в обратном порядке
        Scanner scanner = new Scanner(System.in);
        float counter = 0;
        System.out.println("How many numbers?");
        int n = scanner.nextInt();
        int n2 = n;
        int[] arr = new int[n];
        do {
            int x = scanner.nextInt();
            arr[n - 1] = x;
            counter += x; // Увеличиваем счетчик суммы
            n--;
        } while (n > 0);
        System.out.println("Сумма:" + counter);
        int max = arr[0];
        int min = arr[0];

        // Находим максимум и минимум чисел
        while (n2 > 0) {
            if (max < arr[n2 - 1]) {
                max = arr[n2 - 1];
            }
            if (min > arr[n2 - 1]) {
                min = arr[n2 - 1];
            }
            n2--;
        }
        System.out.println("Макс:" + max + "   Мин:" + min); // Выводим сумму, максимум и минимум
    }

    public static void third(String[] args) { // Третья задача: Вывод аргументов командной строки
        for (String i : args) {
            System.out.println(i); // Вывод каждого аргумента
        }
    }

    public static void fourth() { // Четвертая задача: Вывод десяти чисел в формате с тремя десятичными знаками
        for (int i = 1; i < 11; i++) {
            System.out.println(String.format("%.3f", 1.0 / i)); // Вывод числа с тремя десятичными знаками
        }
    }

    public static int fifth(int value) { // Пятая задача: Вычисление факториала числа
        int counter = 1;
        for (int i = 1; i <= value; i++) {
            counter *= i; // Вычисление факториала
        }
        return counter; // Возвращаем результат
    }
}
