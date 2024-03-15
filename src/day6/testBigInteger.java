package day6;

import java.math.BigInteger;

public class testBigInteger {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("1234567890");
        BigInteger b2 = new BigInteger("9876543210");
        System.out.println(b1.add(b2));
        System.out.println(b1.multiply(b2));
    }
}
