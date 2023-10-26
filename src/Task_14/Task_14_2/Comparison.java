package Task_14.Task_14_2;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Comparison {
    public static boolean isMatching(String input) {
        String regex = "^abcdefghijklmnopqrstuv18340$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sc1 = scanner.nextLine();
        boolean isValid = isMatching(sc1);
        System.out.println("validString is valid: " + isValid);
    }
}
