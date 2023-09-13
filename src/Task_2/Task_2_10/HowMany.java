package Task_2.Task_2_10;

import java.util.Scanner;

public class HowMany {
    public static void main(String [] args){
        System.out.print("Введите предложение: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String [] arr = str.split(" ");
        System.out.println(arr.length);
    }
}
