package Task_2.Task_2_6;


public class CircleTest {
    public static void main(String [] args){
        Circle c1 = new Circle(3,1,3);
        Circle c2 = new Circle(4.2,43.2,55);
        System.out.println("Circle1: x:" +c1.getX() + " y:" + c1.getY() + " r:" +c1.getR());
        System.out.println("Circle2: x:" +c2.getX() + " y:" + c2.getY() + " r:" +c2.getR());
        c2.setX(1);
        c2.setY(3.134);
        c2.setR(0.5);
        System.out.println("NewCircle2: x:" +c2.getX() + " y:" + c2.getY() + " r:" +c2.getR());
        System.out.println("Circle1: Perimeter:" + c1.getCirclePerimeter() + " CircleArea:" + c1.getCircleArea());
        System.out.println("Circle2: Perimeter:" + c2.getCirclePerimeter() + " CircleArea:" + c2.getCircleArea());
        System.out.println(Circle.circleCompares(c1,c2));

    }
}
