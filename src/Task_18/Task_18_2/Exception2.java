package Task_18.Task_18_2;

import java.util.Scanner;


public class Exception2 {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }
    }
    public static void main(String[] args) {
        exceptionDemo();
    }
}