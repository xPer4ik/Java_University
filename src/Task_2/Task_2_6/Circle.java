package Task_2.Task_2_6;

public class Circle {
    private double x;
    private double y;
    private  double r;

    public Circle(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getR() {
        return r;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setR(double r) {
        this.r = r;
    }
    public double getCircleArea(){
        return Math.PI * Math.pow(r,2);
    }
    public double getCirclePerimeter(){
        return 2 * Math.PI * r;
    }

    public static String circleCompares(Circle c1, Circle c2){
        if(c1.r > c2.r){
            return "Первый круг больше второго";
        }
        else{
            return "Второй круг больше второго";
        }
    }
}

