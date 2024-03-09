package day5.question11and12;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());
        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());

        Circle c3 = new Circle(1.1);
        System.out.println(c3);
        Circle c4 = new Circle();
        System.out.println(c4);
        c3.setRadius(2.2);
        System.out.println(c3);
        System.out.println("radius is: " + c3.getRadius());
        System.out.printf("Area is: %.2f%n", c3.getArea());
        System.out.printf("Circumference is: %.2f%n", c3.getCircumference());

    }


}
