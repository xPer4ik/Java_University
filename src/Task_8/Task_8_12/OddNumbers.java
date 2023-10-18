package Task_8.Task_8_12;

import java.util.Scanner;
import java.util.ArrayList;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int number;

        System.out.println("Введите последовательность натуральных чисел (0 для завершения):");

        while (true) {
            number = scanner.nextInt();

            if (number == 0) {
                break; // Выход из цикла при вводе 0
            }

            numbers.add(number);
        }

        System.out.println("Нечетные числа в последовательности:");

        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
}
