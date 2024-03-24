package day7.question14;

public class Square extends Rectangle{
    public Square(){
        super();
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return this.width;
    }
    public void setSide(double side){
        this.width = side;
        this.length = side;
    }
    public void setWidth(double side){
        this.width = side;
        this.length = side;
    }
    public void setLength(double side){
        this.width = side;
        this.length = side;
    }
    @Override
    public String toString(){
        return "Square[" + super.toString() + "]";
    }
}
