package day5.question22;

public class MyPolymonial {
    private double[] coeffs;

    public MyPolymonial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (i == 0) {
                sb.append(coeffs[i]);
            } else {
                sb.append(coeffs[i] + "x^" + i + " + ");
            }
        }
        return sb.toString();
    }

    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coeffs.length; i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    public MyPolymonial add(MyPolymonial right) {
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        double[] result = new double[maxDegree + 1];
        for (int i = 0; i < result.length; i++) {
            if (i <= this.getDegree()) {
                result[i] += this.coeffs[i];
            }
            if (i <= right.getDegree()) {
                result[i] += right.coeffs[i];
            }
        }
        return new MyPolymonial(result);
    }

    public MyPolymonial multiply(MyPolymonial right) {
        double[] result = new double[this.getDegree() + right.getDegree() + 1];
        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree(); j++) {
                result[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        return new MyPolymonial(result);
    }
}
