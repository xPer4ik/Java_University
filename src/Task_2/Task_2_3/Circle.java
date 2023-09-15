package Task_2.Task_2_3;

public class Circle { // класс круг

    private double radius;
    private Point p;
    public Circle(double r){
        this.radius = r;
    } // конструктор класса Circle
    public void setPoint(double x, double y){
        this.p = new Point(x,y);
    } // установака координат круга
    public String toString(){// вывод информации о круге
        return "x:"+ this.p.getX() + " y:"+ this.p.getY() + " radius:" + this.radius;
    }
}
