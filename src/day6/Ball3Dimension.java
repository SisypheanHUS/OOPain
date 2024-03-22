package day6;

public class Ball3Dimension {
    private float x;
    private float y;
    private float z;

    public Ball3Dimension(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }
    public void setXYZ(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public String toString(){
        return "Ball3D[(" + x + "," + y + "," + z + ")]";
    }
}
