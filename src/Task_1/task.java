package Task_1;

import java.util.Scanner;
public class task {


    public static void main(String[] args) {
        first();
        second();
        third(args);
        fourth();
        System.out.println(fifth(5));
    }
    public static void first() {
        Scanner scanner = new Scanner(System.in);
        float counter = 0;
        System.out.println("How many numbers?");
        int n = scanner.nextInt();
        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            arr[i] = x;
            counter += x;
        }
        System.out.println("Сумма:" + counter);
        System.out.println("Среднее:" + counter/n);
    }
    public static void second(){
        Scanner scanner = new Scanner(System.in);
        float counter = 0;
        System.out.println("How many numbers?");
        int n = scanner.nextInt();
        int n2 = n;
        int[] arr = new int[n];
        do {
            int x = scanner.nextInt();
            arr[n-1] = x;
            counter += x;
            n--;
        }
        while(n>0);
        System.out.println("Сумма:" + counter);
        int max = arr[0];
        int min = arr[0];
        while(n2>0){
            if(max < arr[n2-1]){
                max = arr[n2-1];
            }
            if(min > arr[n2-1]){
                min = arr[n2-1];
            }
            n2--;
        }
        System.out.println("Макс:"+max +"   Мин:"+ min);
    }
    public static void third(String [] args){
        for(String i :args){
            System.out.println(i);
        }
    }
    public static void fourth(){
        for(int i = 1; i <11; i++){
            System.out.println(String.format("%.3f",1.0/i));
        }
    }
    public static int fifth(int value){
        int counter = 1;
        for(int i = 1; i <= value; i++){
            counter*=i;
        }
        return counter;
    }
}