package Task_7.Task_7_4;

public class Tester {

    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();
        double result1 = mc1.power(2, 3); // Возведение 2 в 3 степень
        double result2 = mc1.complexModulus(3, 4); // Модуль комплексного числа (3 + 4i)
        double piValue = mc1.getPI(); // Получение числа PI из интерфейса
        System.out.println("2^3 = " + result1);
        System.out.println("Modulus of (3 + 4i) = " + result2);
        System.out.println("PI = " + piValue);

        MathFunc mathFunc = new MathFunc();
        double circleLength = mathFunc.calculateCircleLength(5); // Вычисление длины окружности
        System.out.println("Circle Length with radius 5 = " + circleLength);
    }

}
