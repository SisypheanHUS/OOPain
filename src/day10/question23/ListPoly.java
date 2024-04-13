package day10.question23;

import java.util.ArrayList;
import java.util.List;

public class ListPoly extends AbstractPoly {
    List<Double> coefficients;

    public ListPoly(double[] coeffs) {
        this.coefficients = new ArrayList<>();
        for (double coefficient : coeffs) {
            this.coefficients.add(coefficient);
        }
    }
        @Override
        public double[] coefficients () {
            double[] coefficients = new double[this.coefficients.size()];
            for (int i = 0; i < this.coefficients.size(); i++) {
                coefficients[i] = this.coefficients.get(i);
            }
            return coefficients;
        }
        @Override
        public int degree () {
            for (int i = coefficients.size() - 1; i >= 0; i--) {
                if (coefficients.get(i) != 0) {
                    return i;
                }
            }
            return 0;
        }
        @Override
        public double coefficient ( int degree){
            return coefficients.get(degree);
        }
        @Override
        public Poly derivative () {
            return new ListPoly(derive());
        }
    }
