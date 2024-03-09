package day5.question210;

import day5.question26.MyPoint;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(int x1, int y1, int x2, int y2){
        topLeft = new MyPoint(x1, y1);
        bottomRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight){
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public String toString(){
        return "Rectangle[(" + topLeft.getX() + "," + topLeft.getY() + "),(" + bottomRight.getX() + "," + bottomRight.getY() + ")]";
    }

    public double getArea(){
        return (topLeft.getX() - bottomRight.getX()) * (topLeft.getY() - bottomRight.getY());
    }

    public double getPerimeter(){
        return 2 * (topLeft.getX() - bottomRight.getX() + topLeft.getY() - bottomRight.getY());
    }
}
