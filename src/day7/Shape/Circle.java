package day7.Shape;

public class Circle extends Shape{
    double radius;
    public Circle(){
        super();
        this.radius = 1.0;
    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color){
        super(color);
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }
    public String toString(){
        return "Circle[" + super.toString() + ",radius=" + this.radius + "]";
    }
}
