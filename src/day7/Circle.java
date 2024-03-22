package day7;

public class Circle {
    double radius;
    String color;
    public Circle(){
        this.radius = 1.0;
        this.color = "red";
    }
    public Circle(double radius){
        this.radius = radius;
        this.color = "red";
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
    public String toString(){
        return "Circle[radius=" + this.radius + ",color=" + this.color + "]";
    }
}
