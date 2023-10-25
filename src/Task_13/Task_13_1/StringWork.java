package Task_13.Task_13_1;

import java.util.Scanner;

public class StringWork {
    public static void main(String[] args) {
        // Шаг 1: Принимаем строку в качестве параметра
        String input = "I like Java!!!";
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        // Шаг 2: Распечатываем последний символ
        char lastChar = input.charAt(input.length() - 1);
        System.out.println("Последний символ строки: " + lastChar);

        // Шаг 3: Проверяем, заканчивается ли строка на "!!!"
        boolean endsWithExclamation = input.endsWith("!!!");
        System.out.println("Заканчивается на '!!!'? " + endsWithExclamation);

        // Шаг 4: Проверяем, начинается ли строка с "I like"
        boolean startsWithILike = input.startsWith("I like");
        System.out.println("Начинается с 'I like'? " + startsWithILike);

        // Шаг 5: Проверяем, содержит ли строка "Java"
        boolean containsJava = input.contains("Java");
        System.out.println("Содержит 'Java'? " + containsJava);

        // Шаг 6: Находим позицию подстроки "Java"
        int javaIndex = input.indexOf("Java");
        System.out.println("Позиция 'Java' в строке: " + javaIndex);

        // Шаг 7: Заменяем все 'а' на 'о'
        String replacedString = input.replace('a', 'o');
        System.out.println("Строка после замены: " + replacedString);

        // Шаг 8: Преобразуем строку к верхнему регистру
        String uppercaseString = input.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + uppercaseString);

        // Шаг 9: Преобразуем строку к нижнему регистру
        String lowercaseString = input.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowercaseString);

        // Шаг 10: Вырезаем подстроку "Java"
        String substring = input.substring(7, 11); // Индексы 7 и 11 - это начало и конец подстроки "Java"
        System.out.println("Вырезанная подстрока: " + substring);
    }
}