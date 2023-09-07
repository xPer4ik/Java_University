package Task_2.Task_2_1;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args){
        Author first_author = new Author("Valera", "valera@gmail.com", 'm');
        System.out.println("Имя:" + first_author.getName());
        System.out.println("Почта:" + first_author.getEmail());
        System.out.println("Пол:" + first_author.getGender());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите почту:");
        first_author.setEmail(scanner.nextLine());
        System.out.println("Информация об авторе:" + first_author.toString());
    }
}