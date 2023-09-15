package Task_2.Task_2_10;

import java.util.Scanner;

public class HowMany {
    public static void main(String [] args){  // метод который выводит количнство элементов введенных полозователем
        System.out.print("Введите предложение: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String [] arr = str.split(" ");
        System.out.println(arr.length);
    }
}
