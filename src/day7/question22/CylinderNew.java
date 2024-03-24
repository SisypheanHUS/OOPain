package day7.question22;

import day7.question11.Circle;

public class CylinderNew {
    private Circle base;
    private double height;
    public CylinderNew(){
        this.base = new Circle();
        this.height = 1.0;
    }
    public CylinderNew(double radius){
        this.base = new Circle(radius);
        this.height = 1.0;
    }
    public CylinderNew(double radius, double height){
        this.base = new Circle(radius);
        this.height = height;
    }
    public CylinderNew(double radius, double height, String color){
        this.base = new Circle(radius, color);
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getVolume(){
        return this.base.getArea() * this.height;
    }
    @Override
    public String toString(){
        return "CylinderNew[base=" + this.base.toString() + ",height=" + this.height + "]";
    }
}
