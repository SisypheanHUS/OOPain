package day7;

public class Point {
    float x;
    float y;
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }
    public Point(){
        this(0.0f, 0.0f);
    }
    public float getX(){
        return this.x;
    }
    public void setX(float x){
        this.x = x;
    }
    public float getY(){
        return this.y;
    }
    public void setY(float y){
        this.y = y;
    }
    public float[] getXY(){
        return new float[]{this.x, this.y};
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }
}
