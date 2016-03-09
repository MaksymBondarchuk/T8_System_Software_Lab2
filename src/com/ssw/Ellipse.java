package com.ssw;

public class Ellipse {
    /**
     * X radius
     */
    private int a;
    /**
     * Y radius
     */
    private int b;

    public double getXFromY(int y) {
        return a * Math.sqrt(1 - y * y / b / b);
    }

    public double getYFromX(int x) {
        return a * Math.sqrt(1 - x * x / a / a);
    }

    public void setA(int a) {
        if (a == 0)
            throw new ArithmeticException("Ellipse X-radius (A) cannot be 0");
        else
            this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        if (b == 0)
            throw new ArithmeticException("Ellipse Y-radius (B) cannot be 0");
        else
            this.b = b;
    }

    public int getB() {
        return b;
    }
}
