package Task_19.Task_19_1;

public class OnlinePurchase {
    // Метод для проверки действительности ИНН
    private static boolean isValidINN(String inn) {
        // Здесь реализуем проверку действительности ИНН
        // Мы просто симулируем проверку, предполагая, что ИНН действителен, если его длина равна 10
        return inn.length() == 10;
    }

    // Метод для оформления заказа
    public static void placeOrder(String fullName, String inn) {
        try {
            if (!isValidINN(inn)) {
                throw new InvalidINNException("Invalid INN: " + inn);
            }

            // Остальной код для оформления заказа
            System.out.println("Order placed successfully!");
        } catch (InvalidINNException e) {
            System.out.println("Error placing order: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Пример использования
        placeOrder("Tom", "1231231231"); // Валидный ИНН
        placeOrder("Bob", "22234123"); // Невалидный ИНН
    }
}
