package Task_13.Task_13_2;

public class Tester {
    public static void main(String[] args) {
        Person person1 = new Person("Иванов", "Иван", "Иванович");
        System.out.println(person1.getFullName()); // Выведет: Иванов И.И.

        Person person2 = new Person("Петров", "Петр", null);
        System.out.println(person2.getFullName()); // Выведет: Петров П.
        Person person3 = new Person("Петров", null, null);
        System.out.println(person3.getFullName()); // Выведет: Петров П.
    }
}
