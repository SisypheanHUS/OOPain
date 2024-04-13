package day10.question23;

public class ArrayPoly extends AbstractPoly{
    private final double[] coefficients;
    public ArrayPoly(double[] coefficients){
        this.coefficients = coefficients;
    }
    @Override
    public double[] coefficients(){
        return coefficients;
    }
    @Override
    public int degree(){
        return coefficients.length-1;
    }
    @Override
    public double coefficient(int degree){
        return coefficients[degree];
    }
    @Override
    public Poly derivative(){
        return new ArrayPoly(derive());
    }
}
