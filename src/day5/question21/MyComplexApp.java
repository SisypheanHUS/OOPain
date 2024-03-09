package day5.question21;
import java.util.Scanner;
public class MyComplexApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real part of the first complex number: ");
        double real1 = sc.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number: ");
        double imag1 = sc.nextDouble();
        System.out.println("Enter the real part of the second complex number: ");
        double real2 = sc.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number: ");
        double imag2 = sc.nextDouble();
        MyComplex c1 = new MyComplex(real1, imag1);
        MyComplex c2 = new MyComplex(real2, imag2);
        System.out.println(c1);
        System.out.println(c1.isReal());
        System.out.println(c1.isImaginary());
        System.out.println(c1.getReal());
        System.out.println(c1.getImag());
        c1.setValue(3.0, 4.0);
        System.out.println(c1);
        System.out.println(c1.magnitude());
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(3.0, 4.0));
        c1.setImag(1.0);
        System.out.println(c1);
    }
}
