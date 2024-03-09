package day5.question28;
import day5.question26.MyPoint;
public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(3, 4, 5);
        System.out.println(c1);
        c1.setRadius(6);
        System.out.println(c1);
        c1.setCenter(new MyPoint(7, 8));
        System.out.println(c1);
        System.out.println("center is: " + c1.getCenter());
        c1.setCenterX(9);
        c1.setCenterY(10);
        System.out.println(c1);
        c1.setCenterXY(11, 12);
        System.out.println(c1);
        System.out.println("center's x is: " + c1.getCenterX());
        System.out.println("center's y is: " + c1.getCenterY());
        System.out.println("center's xy is: " + c1.getCenterXY()[0] + ", " + c1.getCenterXY()[1]);
    }
}
