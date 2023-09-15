package Task_2.Task_2_4;

import java.util.Scanner;

public class Tester {

    public static void main(String [] args){ // работа с магазином
        boolean working = true;
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Shop shop = new Shop();

        while(working){ // интерфейс
            System.out.println(
                    """
                    1) Добавить компьютер
                    2) Удалить компьютер
                    3) Поиск компьютера
                    4) Выход""");
            int action = scanner.nextInt(); // запуск методов в зависимости от требований пользователя
            if (action == 1)
                shop.addComputer(scanner2.nextLine());
            else if (action == 2)
                shop.removeComputer(scanner2.nextLine());
            else if (action == 3)
                System.out.println(shop.containsComputer(scanner2.nextLine()));
            else if (action == 4)
                working = false;
        }
    }
}
