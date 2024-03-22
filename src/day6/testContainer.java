package day6;

public class testContainer {
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50, 5, 10, 30);
        Container box = new Container(0, 0, 100, 100);
        System.out.println(ball);
        for (int i = 0; i < 10; i++) {
            ball.move();
            box.collides(ball);
            System.out.println(ball);
        }
    }
}
