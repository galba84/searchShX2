package org.example;

public class Calc {
    public static final double exponent = 2.718;

    public double findSh(int x) {
        double left = Math.pow(exponent, x);
        double right = Math.pow(exponent, -x);
        return (left - right) / 2;
    }
}
