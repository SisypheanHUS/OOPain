package day8;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        System.out.println(p1);
        p1.setXY(100, 10);
        System.out.println(p1);
        System.out.println("x is: " + p1.getX());
        System.out.println("y is: " + p1.getY());
        p1.setX(300);
        p1.setY(400);
        System.out.println(p1);
        System.out.println("x is: " + p1.getX());
        System.out.println("y is: " + p1.getY());
    }
}
