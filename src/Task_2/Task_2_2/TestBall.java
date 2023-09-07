package Task_2.Task_2_2;

public class TestBall {
    public static void main(String[] args){
        Ball ball1 = new Ball(1.0,4.0);
        Ball ball2 = new Ball();
        System.out.println("x:" + ball1.getX());
        System.out.println("y:" + ball1.getY());
        ball1.setX(3.0);
        ball1.setY(4.0);
        ball2.setXY(7.0,8.0);
        ball2.move(9.0,10.0);
        System.out.println(ball1.toString());
        System.out.println(ball2.toString());
    }
}