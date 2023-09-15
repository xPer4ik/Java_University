package Task_2.Task_2_2;

public class Ball { // класс мяч
    private double x = 0.0;
    private double y = 0.0;
    public Ball(double x, double y){ // конструктор мяча
        this.x = x;
        this.y = y;
    }
    public Ball(){} // пустой конструктор

    public double getX() { // получить координату по X
        return this.x;
    }
    public void setX(double x) { // установить координату X
        this.x = x;
    }
    public double getY() { // получить координату по Y
        return this.y;
    }

    public void setY(double y) {// установить координату Y
        this.y = y;
    }
    public  void setXY(double x, double y){ // установить координаты X и Y
        this.x = x;
        this.y = y;
    }
    public void move(double xDisp,double yDisp){ // перемещение мяча по координатам
        this.x += xDisp;
        this.y += yDisp;
    }
    public String toString(){ // вывод координат мяча
        return "Ball{" + "x=" + this.x + ", y=" + this.y + "}";
    }

}