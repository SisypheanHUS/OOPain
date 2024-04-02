package day8.question14;

public class MovableCircle implements Movable {
    int radius;
    MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        this.center.moveUp();
    }

    @Override
    public void moveDown() {
        this.center.moveDown();
    }

    @Override
    public void moveLeft() {
        this.center.moveLeft();
    }

    @Override
    public void moveRight() {
        this.center.moveRight();
    }

    public String toString() {
        return String.format("MovableCircle[center=%s,radius=%d]", this.center.toString(), this.radius);
    }
}
