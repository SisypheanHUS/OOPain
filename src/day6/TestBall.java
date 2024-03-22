package day6;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50, 5, 10, 30);
        System.out.println(ball);
        for (int i = 0; i < 10; i++) {
            ball.move();
            System.out.println(ball);
        }
    }
}
