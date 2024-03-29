package day7.question14;

public class Shape {
    String color;
    boolean filled;
    public Shape() {
        this.color = "red";
        this.filled = true;
    }
    public Shape(String color) {
    this.color = color;
    this.filled = true; // or false, depending on what you want the default to be
}
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
@Override
    public String toString() {
        return "Shape[color=" + this.color + ",filled=" + this.filled + "]";
    }
}
