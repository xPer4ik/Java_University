package Task_18.Task_18_3;

import java.util.Scanner;

import java.util.Scanner;

public class Exception3 {
    public static void exceptionDemo2() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (Exception e) {
            System.out.println("General Exception");
        }
    }
    public static void main(String[] args) {
        exceptionDemo2();
    }
}