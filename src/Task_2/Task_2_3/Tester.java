package Task_2.Task_2_3;

import java.util.Scanner;

public class Tester {
    public Circle [] circles = new Circle[10];
    public int count_of_circles = 0;

    public Tester new_circle(Tester t)
    {
        Scanner scanner = new Scanner(System.in);;
        System.out.println("Введите радиус:");
        Circle c = new Circle(scanner.nextDouble());
        System.out.println("Введите координаты точки через пробел:");
        c.setPoint(scanner.nextDouble(),scanner.nextDouble());
        t.circles[t.count_of_circles] = c;
        t.count_of_circles++;
        return t;

    }

    public static void main(String[] args) {
        Tester t = new Tester();
        t = t.new_circle(t);
        t = t.new_circle(t);

        for(int i=0;i<t.count_of_circles;i++){
            System.out.println("\n");
            System.out.println(t.circles[i].toString());
        }
    }
}
