package Task_2.Task_2_6;

public class Circle {
    private double x;
    private double y;
    private  double r;

    public Circle(double x, double y, double r){ // конструктор класса Circle
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public double getX() {
        return x;
    } // получить координату X
    public double getY() {
        return y;
    } // получить координату Y
    public double getR() {
        return r;
    } // получить радиус
    public void setX(double x) {
        this.x = x;
    } // установить координату X
    public void setY(double y) {
        this.y = y;
    }// установить координату Y
    public void setR(double r) {
        this.r = r;
    }// установить радиус
    public double getCircleArea(){
        return Math.PI * Math.pow(r,2);
    } // получить площадь кргуа
    public double getCirclePerimeter(){
        return 2 * Math.PI * r;
    } // получить периметр круга

    public static String circleCompares(Circle c1, Circle c2){ // сранение кругов
        if(c1.r > c2.r){
            return "Первый круг больше второго";
        }
        else{
            return "Второй круг больше второго";
        }
    }
}

