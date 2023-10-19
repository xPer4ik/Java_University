package Task_8.Task_8_15;

public class ReversedNumbers {
    public static void printDigitsReverse(int n) {
        if (n > 0) {
            int lastDigit = n % 10;  // Получаем последнюю цифру числа
            System.out.println(lastDigit);  // Выводим её
            printDigitsReverse(n / 10);  // Рекурсивно вызываем функцию для оставшихся цифр
        }
    }
    public static void main(String[] args) {
        int n = 174345;
        printDigitsReverse(n);
    }
}

