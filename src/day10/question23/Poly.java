package day10.question23;

public interface Poly {
    double[] coefficients();
    int degree();
    double coefficient(int degree);
    Poly derivative();
}
