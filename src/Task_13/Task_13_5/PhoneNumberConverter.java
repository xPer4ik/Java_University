package Task_13.Task_13_5;


public class PhoneNumberConverter {
    public static String formatPhoneNumber(String input) {
        // Удаляем все пробелы и дефисы, если они есть
        String cleanedInput = input.replaceAll("[\\s-]", "");

        // Проверяем, в каком формате задан номер и преобразуем его
        if (cleanedInput.startsWith("+")) {
            // Формат +<Код страны><Номер 10 цифр>
            if (cleanedInput.length() == 12 && cleanedInput.substring(1).matches("\\d+")) {
                String countryCode = cleanedInput.substring(1, 4);
                String firstPart = cleanedInput.substring(4, 7);
                String secondPart = cleanedInput.substring(7);
                return "+" + countryCode + "-" + firstPart + "-" + secondPart;
            }
        } else if (cleanedInput.startsWith("8") && cleanedInput.length() == 11) {
            // Формат 8<Номер 10 цифр> для России
            String firstPart = cleanedInput.substring(1, 4);
            String secondPart = cleanedInput.substring(4, 7);
            String thirdPart = cleanedInput.substring(7);
            return "+7" + "-" + firstPart + "-" + secondPart + "-" + thirdPart;
        }

        // Если ни один из форматов не подходит, вернуть исходную строку
        return input;
    }

    public static void main(String[] args) {
        String phoneNumber1 = "+79175655655";
        String phoneNumber2 = "+104289652211";
        String phoneNumber3 = "89175655655";

        System.out.println(formatPhoneNumber(phoneNumber1)); // +7-917-565-5655
        System.out.println(formatPhoneNumber(phoneNumber2)); // +104-289-652-211
        System.out.println(formatPhoneNumber(phoneNumber3)); // +7-917-565-5655
    }
}