package day8.question18;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString(){
        return "Circle at (" + center.x + ", " + center.y + ")";
    }

    @Override
    public void moveUp(){
        center.y += center.ySpeed;
    }

    @Override
    public void moveDown(){
        center.y -= center.ySpeed;
    }

    @Override
    public void moveLeft(){
        center.x -= center.xSpeed;
    }

    @Override
    public void moveRight(){
        center.x += center.xSpeed;
    }
}
