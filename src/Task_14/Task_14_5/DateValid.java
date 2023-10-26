package Task_14.Task_14_5;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class DateValid {
    public static boolean isDateValid(String input) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((19\\d\\d|20\\d\\d)|9999)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }

    public static void main(String[] args) {

        String validDate1 = "29/02/2000";
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        System.out.println(isDateValid(date));

    }
}
