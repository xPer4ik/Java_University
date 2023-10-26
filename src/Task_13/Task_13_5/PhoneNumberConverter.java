package Task_13.Task_13_5;


public class PhoneNumberConverter {
    public static String formatPhoneNumber(String input) {
        // Удаляем все символы, кроме цифр
        String digits = input.replaceAll("\\D", "");

        // Проверяем, в каком формате передан номер
        if (digits.startsWith("8")) {
            // Добавляем +7 для России
            digits = "7" + digits.substring(1);
        } else if (digits.startsWith("+")) {
            // Удаляем символ "+" в начале строки
            digits = digits.substring(1);
        }

        // Проверяем, что у нас достаточно цифр для форматирования
        if (digits.length() >= 10) {
            // Форматируем номер
            String countryCode = digits.substring(0, digits.length() - 10);
            String firstPart = digits.substring(digits.length() - 10, digits.length() - 7);
            String secondPart = digits.substring(digits.length() - 7, digits.length() - 4);
            String thirdPart = digits.substring(digits.length() - 4);

            return "+" + countryCode + "-" + firstPart + "-" + secondPart + "-" + thirdPart;
        } else {
            // Если цифр недостаточно, вернем исходную строку
            return input;
        }
    }

    public static void main(String[] args) {
        System.out.println("Было:");
        String phoneNumber1 = "+79175655655";
        String phoneNumber2 = "+104289652211";
        String phoneNumber3 = "89175655655";
        String phoneNumber4 = "+71113334445555";

        System.out.println(phoneNumber1);
        System.out.println(phoneNumber2);
        System.out.println(phoneNumber3);
        System.out.println(phoneNumber4);


        String formatted1 = formatPhoneNumber(phoneNumber1);
        String formatted2 = formatPhoneNumber(phoneNumber2);
        String formatted3 = formatPhoneNumber(phoneNumber3);
        String formatted4 = formatPhoneNumber(phoneNumber4);
        System.out.println("Стало:");
        System.out.println(formatted1);
        System.out.println(formatted2);
        System.out.println(formatted3);
        System.out.println(formatted4);
    }
}