package Task_8.Task_8_9;

public class WithoutTwoZeros {
    public static void main(String[] args) {
        int a = 3; // Количество нулей
        int b = 4; // Количество единиц

        int count = countSequences(a, b);
        System.out.println("Количество последовательностей без двух нулей: " + count);
    }

    static int countSequences(int zerosLeft, int onesLeft) {
        if (zerosLeft == 0) {
            // Если не осталось нулей, то единственный вариант - добавить единицы
            return 1;
        }

        int count = 0;

        if (zerosLeft > 0) {
            count += countSequences(zerosLeft - 1, onesLeft); // Добавляем ноль
        }

        if (onesLeft > 0 && zerosLeft < 2) {
            count += countSequences(zerosLeft, onesLeft - 1); // Добавляем единицу (если нет двух нулей подряд)
        }

        return count;
    }
}






