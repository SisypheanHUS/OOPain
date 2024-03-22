package day7;

public class MovablePoint extends Point{
    float xSpeed;
    float ySpeed;
    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed){
        this(0.0f, 0.0f, xSpeed, ySpeed);
    }
    public MovablePoint(){
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }
    public float getXSpeed(){
        return this.xSpeed;
    }
    public void setXSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }
    public float getYSpeed(){
        return this.ySpeed;
    }
    public void setYSpeed(float ySpeed){
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{this.xSpeed, this.ySpeed};
    }
    public String toString(){
        return "(" + this.x + "," + this.y + "),speed=(" + this.xSpeed + "," + this.ySpeed + ")";
    }
    public MovablePoint move(){
        this.x += this.xSpeed;
        this.y += this.ySpeed;
        return this;
    }
}
