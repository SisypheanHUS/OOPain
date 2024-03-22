package day6;

public class Player {
    int number;
    float x;
    float y;
    float z;

    public Player(int number, float x, float y, float z) {
        this.number = number;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void move(float xDisp, float yDisp, float zDisp) {
        this.x += xDisp;
        this.y += yDisp;
        this.z += zDisp;
    }

    public void jump(float zDisp) {
        this.z += zDisp;
    }

    public boolean near(Player player) {
        return Math.sqrt(Math.pow(this.x - player.x, 2) + Math.pow(this.y - player.y, 2) + Math.pow(this.z - player.z, 2)) <= 8;
    }

    public void kick(Player player) {
        if (this.near(player)) {
            player.jump(1);
        }
    }
    public String toString() {
        return "Player" + number + "[(" + x + "," + y + "," + z + ")]";
    }
}
