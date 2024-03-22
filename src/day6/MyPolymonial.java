package day6;

public class MyPolymonial {
    private double[] coeffs;

    public MyPolymonial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (coeffs[i] != 0) {
                return i;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
    StringBuilder myPoly = new StringBuilder();
    for (int i = coeffs.length - 1; i >= 0; i--) {
        if (coeffs[i] == 0) {
            continue;
        }
        if (i == this.getDegree()) {
            myPoly.append(coeffs[i] + "x^" + i);
        } else if (i == 1) {
            myPoly.append((coeffs[i] > 0 ? "+" : "") + coeffs[i] + "x");
        } else if (i == 0) {
            myPoly.append((coeffs[i] > 0 ? "+" : "") + coeffs[i]);
        } else {
            myPoly.append((coeffs[i] > 0 ? "+" : "") + coeffs[i] + "x^" + i);
        }
    }
    return myPoly.toString();
    }
    public double evaluate(double x) {
        double result = 0.0;
        double powerOfX = 1.0;
        for (int i = 0; i < coeffs.length; i++) {
            result += coeffs[i] * powerOfX;
            powerOfX *= x;
        }
        return result;
    }

    public MyPolymonial add(MyPolymonial right) {
        int minDegree = Math.min(this.getDegree(),right.getDegree());
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        double[] result = new double[maxDegree + 1];
        for (int i = 0; i < result.length; i++) {
            if (i <= minDegree) {
                result[i] = this.coeffs[i] + right.coeffs[i];
            } else {
                if(maxDegree == right.getDegree()){
                    result[i] = right.coeffs[i];
                } else {
                    result[i] = this.coeffs[i];
                }
            }
        }
        this.coeffs = result;
        return this;
    }

    public MyPolymonial multiply(MyPolymonial right) {
        double[] result = new double[this.getDegree() + right.getDegree() + 1];
        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree(); j++) {
                result[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        this.coeffs = result;
        return this;
    }
}
