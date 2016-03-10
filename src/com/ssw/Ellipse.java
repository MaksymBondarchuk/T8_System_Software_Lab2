package com.ssw;

import java.lang.Object;


public class Ellipse implements Cloneable {
    /**
     * X radius
     */
    private int a;
    /**
     * Y radius
     */
    private int b;

    public Ellipse(int a, int b) {
        setA(a);
        setB(b);
    }

    public Ellipse(Ellipse ellipse) {
        this(ellipse.getA(), ellipse.getB());
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

    public double getXFromY(int y) {
        return a * Math.sqrt(1 - y * y / b / b);
    }

    public double getYFromX(int x) {
        return a * Math.sqrt(1 - x * x / a / a);
    }

    @Override
    protected Ellipse clone() throws CloneNotSupportedException {
        return (Ellipse) super.clone();
    }

    @Override
    public String toString() {
        return String.format("A = %d, B = %d", a, b);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Ellipse))
            return false;
        if (obj == this)
            return true;

        Ellipse ellipse = (Ellipse) obj;
        return ellipse.a == ((Ellipse) obj).getA() && ellipse.b == ((Ellipse) obj).getB();
    }

//    @Override
//    public int hashCode() {
//        return new HashCodeBuilder(17, 31). // two randomly chosen prime numbers
//                // if deriving: appendSuper(super.hashCode()).
//                        append(name).
//                        append(age).
//                        toHashCode();
//    }

}
