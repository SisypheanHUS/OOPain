package day8.question11;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle() {
        this.width = 1.0; // default width
        this.length = 1.0; // default length
    }
    public Rectangle(double width, double length) { // parameterized constructor
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) { // parameterized constructor
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() { // returns the width value
        return this.width;
    }
    public void setWidth(double width) { // sets the width value
        this.width = width;
    }
    public double getLength() { // returns the length value
        return this.length;
    }
    public void setLength(double length) { // sets the length value
        this.length = length;
    }
    @Override
    public double getArea() { // returns the area of the rectangle
        return this.width * this.length;
    }
    @Override
    public double getPerimeter() { // returns the perimeter of the rectangle
        return 2 * (this.width + this.length);
    }
    @Override
    public String toString() { // returns a string representation of the rectangle
        return "Rectangle[width=" + this.width + ",length=" + this.length + ",color=" + this.color + ",filled=" + this.filled + "]";
    }
}
