package Task_21.Task_21_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Converter {
    public static <T> List<T> arrayToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    public static void main(String[] args) {
        // Пример использования для массива строк
        String[] stringArray = {"Java", "C++", "Python"};
        List<String> stringList = arrayToList(stringArray);

        System.out.println("List of strings: " + stringList);

        // Пример использования для массива чисел
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println(intArray.getClass());
        List<Integer> intList = arrayToList(intArray);
        System.out.println(intList.getClass());
        System.out.println("List of integers: " + intList);
    }
}
