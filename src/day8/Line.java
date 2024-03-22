package day8;

public class Line {
    private Point begin;
    private Point end;
    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }
    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }

    public String toString() {
        return "Line[begin=" + begin + ",end=" + end + "]";
    }
    public Point getBegin() {
        return this.begin;
    }
    public void setBegin(Point begin) {
        this.begin = begin;
    }
    public Point getEnd() {
        return this.end;
    }
    public void setEnd(Point end) {
        this.end = end;
    }
    public int getBeginX() {
        return this.begin.getX();
    }
    public void setBeginX(int x) {
        this.begin.setX(x);
    }
    public int getBeginY() {
        return this.begin.getY();
    }
    public void setBeginY(int y) {
        this.begin.setY(y);
    }
    public int getEndX() {
        return this.end.getX();
    }
    public void setEndX(int x) {
        this.end.setX(x);
    }
    public int getEndY() {
        return this.end.getY();
    }
    public void setEndY(int y) {
        this.end.setY(y);
    }
    public int[] getBeginXY() {
        return this.begin.getXY();
    }

    public void setBeginXY(int x, int y) {
        this.begin.setXY(x, y);
    }

    public int[] getEndXY() {
        return this.end.getXY();
    }

    public void setEndXY(int x, int y) {
        this.end.setXY(x, y);
    }

    public double getLength() {
        return this.begin.distance(this.end);
    }

    public double getGradient() {
        int yDiff = this.end.getY() - this.begin.getY();
        int xDiff = this.end.getX() - this.begin.getX();
        return Math.atan2(yDiff, xDiff);
    }
}
