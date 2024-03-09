package day5.question27;
import day5.question26.MyPoint;
public class TestMyLine {
    public static void main(String[] args) {
        MyLine l1 = new MyLine(1, 2, 3, 4);
        System.out.println(l1);
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(3, 4);
        MyLine l2 = new MyLine(p1, p2);
        System.out.println(l2);
        l1.setBegin(p1);
        l1.setEnd(p2);
        System.out.println(l1);
        System.out.println("begin is: " + l1.getBegin());
        System.out.println("end is: " + l1.getEnd());
        l1.setBeginX(5);
        l1.setBeginY(6);
        l1.setEndX(7);
        l1.setEndY(8);
        System.out.println(l1);
        System.out.println("begin's x is: " + l1.getBeginX());
        System.out.println("begin's y is: " + l1.getBeginY());
        System.out.println("end's x is: " + l1.getEndX());
        System.out.println("end's y is: " + l1.getEndY());
        l1.setBeginXY(9, 10);
        l1.setEndXY(11, 12);
        System.out.println(l1);
        System.out.println("begin's x is: " + l1.getBeginXY()[0]);
        System.out.println("begin's y is: " + l1.getBeginXY()[1]);
        System.out.println("end's x is: " + l1.getEndXY()[0]);
        System.out.println("end's y is: " + l1.getEndXY()[1]);
        System.out.println("length is: " + l1.getLength());
    }
}
