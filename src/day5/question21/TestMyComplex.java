package day5.question21;

public class TestMyComplex {
    public static void main(String[] args) {
        MyComplex c1 = new MyComplex(1.0, 2.0);
        System.out.println(c1);
        System.out.println(c1.isReal());
        System.out.println(c1.isImaginary());
        System.out.println(c1.getReal());
        System.out.println(c1.getImag());
        c1.setValue(3.0, 4.0);
        System.out.println(c1);
        System.out.println(c1.magnitude());
        MyComplex c2 = new MyComplex(3.0, 4.0);
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(3.0, 4.0));
        c1.setImag(1.0);
        System.out.println(c1);
    }
}
