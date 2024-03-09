package day5.question11and12;

public class Circle {
    private double radius;
    private String color;

    public double getRadius() {
        return this.radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
