package day8.question11;

public class Circle extends Shape {
    protected double radius;
    public Circle() {
        this.radius = 1.0; // default radius
    }
    public Circle(double radius) { // parameterized constructor
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) { // parameterized constructor
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() { // returns the radius value
        return this.radius;
    }
    public void setRadius(double radius) { // sets the radius value
        this.radius = radius;
    }
  @Override
    public double getArea() { // returns the area of the circle
        return Math.PI * this.radius * this.radius;
    }
    @Override
    public double getPerimeter() { // returns the perimeter of the circle
        return 2 * Math.PI * this.radius;
    }
    @Override
    public String toString() { // returns a string representation of the circle
        return "Circle[radius=" + this.radius + ",color=" + this.color + ",filled=" + this.filled + "]";
    }
}
