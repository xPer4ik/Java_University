package Task_6.Task_6_1;

public class MovableCircle implements Movable {
    private final int radius;
    private final MovablePoint center ;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString(){
        return "\ncenter:" + center + "\nradius" + radius;
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }
    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
    @Override
    public void moveUp() {
        center.moveUp();
    }


    public static void main(String[] args) {
        Movable circle1 = new MovableCircle(100,100,5,5,10);
        System.out.println(circle1);
        circle1.moveDown();
        circle1.moveUp();
        circle1.moveLeft();
        circle1.moveLeft();
        circle1.moveRight();
        System.out.println(circle1);

    }
}
