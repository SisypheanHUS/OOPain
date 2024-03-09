package day5.question22;

public class TestMyPolymonial {
    public static void main(String[] args) {
        MyPolymonial p1 = new MyPolymonial(1.1, 2.2, 3.3);
        MyPolymonial p2 = new MyPolymonial(1.1, 2.2, 3.3, 4.4, 5.5);
        double coeffs[] = {1.2, 3.4, 5.6, 7.8};
        MyPolymonial p3 = new MyPolymonial(coeffs);
        System.out.println(p1);
        System.out.println(p1.getDegree());
        System.out.println(p1.evaluate(2));
        System.out.println(p1.add(p2));
        System.out.println(p1.multiply(p2));

    }
}
