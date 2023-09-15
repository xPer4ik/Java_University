package Task_2.Task_2_3;

public class Point { // класс точка
    private double x = 0.0;
    private double y = 0.0;

    public Point(double x, double y){ // конструктор класса Point
        this.x = x;
        this.y = y;
    }

    public double getX() { // получение координаты X
        return x;
    }
    public double getY() {// получение координаты Y
        return y;
    }

}
