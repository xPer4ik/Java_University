package Task_6.Task_6_1;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private final int xSpeed;
    private final int ySpeed;


    MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString(){
        return "\nx:" + this.x + "\ny:" + this.y + "\nxSpeed:" + this.xSpeed + "\nySpeed" + this.ySpeed;
    }
    @Override
    public void moveRight(){
        this.x += this.xSpeed;
    }

    @Override
    public void moveLeft() {
        this.x -= this.xSpeed;
    }

    @Override
    public void moveUp() {
        this.y -= this.ySpeed;
    }

    @Override
    public void moveDown() {
        this.y += this.ySpeed;
    }
}
