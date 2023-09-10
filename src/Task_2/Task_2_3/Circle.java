package Task_2.Task_2_3;

public class Circle {

    private double radius;
    private Point p;
    public Circle(double r){
        this.radius = r;
    }
    public void setPoint(double x, double y){
        this.p = new Point(x,y);
    }
    public String toString(){
        return "x:"+ this.p.getX() + " y:"+ this.p.getY() + " radius:" + this.radius;
    }
}
