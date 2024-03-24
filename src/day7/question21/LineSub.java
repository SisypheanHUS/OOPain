package day7.question21;

public class LineSub extends Point{
    Point end;
    public LineSub(int beginX, int beginY, int endX, int endY){
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }
    public LineSub(Point begin, Point end){
        super(begin.getX(), begin.getY());
        this.end = end;
    }
    public Point getBegin(){
        return new Point(super.getX(), super.getY());
    }
    public Point getEnd(){
        return this.end;
    }
    public void setBegin(Point begin){
        super.setXY(begin.getX(), begin.getY());
    }
    public void setEnd(Point end){
        this.end = end;
    }
    public int getBeginX(){
        return super.getX();
    }
    public void setBeginX(int x){
        super.setX(x);
    }
    public int getBeginY(){
        return super.getY();
    }
    public void setBeginY(int y){
        super.setY(y);
    }
    public int getEndX(){
        return this.end.getX();
    }
    public void setEndX(int x){
        this.end.setX(x);
    }
    public int getEndY(){
        return this.end.getY();
    }
    public void setEndY(int y){
        this.end.setY(y);
    }
    public int[] getBeginXY(){
        return new int[]{super.getX(), super.getY()};
    }
    public void setBeginXY(int x, int y){
        super.setXY(x, y);
    }
public int[] getEndXY(){
        return new int[]{this.end.getX(), this.end.getY()};
    }
    public void setEndXY(int x, int y){
        this.end.setXY(x, y);
    }
    public int getLength(){
        int xDiff = this.end.getX() - super.getX();
        int yDiff = this.end.getY() - super.getY();
        return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
    public double getGradient(){
        int xDiff = this.end.getX() - super.getX();
        int yDiff = this.end.getY() - super.getY();
        return Math.atan2(yDiff, xDiff);
    }
}

