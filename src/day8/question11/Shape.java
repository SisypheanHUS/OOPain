package day8.question11;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        this.color = "red"; // default color
        this.filled = true; // default filled
    }

    public Shape(String color, boolean filled) { // parameterized constructor
        this.color = color;
        this.filled = filled;
    }

    public String getColor() { // returns the color value
        return this.color;
    }

    public void setColor(String color) { // sets the color value
        this.color = color;
    }

    public boolean isFilled() { // returns the filled value
        return this.filled;
    }

    public void setFilled(boolean filled) { // sets the filled value
        this.filled = filled;
    }

    public abstract double getArea(); // returns the area of the object

    public abstract double getPerimeter(); // returns the perimeter of the object

    public abstract String toString(); // returns a string representation of the object
}
