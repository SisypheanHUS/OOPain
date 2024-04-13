package day10.question23;
import java.util.Objects;
public abstract class AbstractPoly implements Poly{
    double[] derive(){
        double[] derive = new double[coefficients().length-1];
        for(int i=0; i<derive.length; i++){
            derive[i] = coefficients()[i+1]*(i+1);
        }
        return derive;
    }
    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        AbstractPoly poly = (AbstractPoly) obj;
        return degree() == poly.degree() && Objects.equals(coefficients(), poly.coefficients());
    }
    @Override
    public int hashCode(){
        return Objects.hash(coefficients(), degree());
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<coefficients().length; i++){
            if(i == 0){
                sb.append(coefficients()[i]);
            }else{
                sb.append(" + ").append(coefficients()[i]).append("x^").append(i);
            }
        }
        return sb.toString();
    }
}
