package Task_3.Task_3_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ListWithFloat {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int countOfNumbers = scanner.nextInt();
        Float [] numbers = new Float[countOfNumbers];
        Float [] numbers2 = new Float[countOfNumbers];
        Random rand = new Random();
        for(int i = 0; i < countOfNumbers;i++) {
            numbers[i] = rand.nextFloat();
            System.out.print(numbers[i] + " ");

        }
        System.out.println();
        for(int i = 0; i < countOfNumbers;i++){
            numbers2[i] = (float) Math.random();
            System.out.print(numbers2[i] + " ");

        }
        Arrays.sort(numbers);
        Arrays.sort(numbers2);
        System.out.println("\n");
        for(int i = 0; i < countOfNumbers;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < countOfNumbers;i++){
            System.out.print(numbers2[i] + " ");

        }

    }
}
