package com.ssw;

import java.lang.Object;

/**
 * Represents ellipse
 */
public class Ellipse implements Cloneable {
    /**
     * X radius
     */
    private int a;
    /**
     * Y radius
     */
    private int b;

    /**
     * Creates ellipse with specified radii
     *
     * @param a X radius
     * @param b Y radius
     */
    public Ellipse(int a, int b) {
        setA(a);
        setB(b);
    }

    /**
     * Copy-constructor
     *
     * @param ellipse Ellipse to copy
     */
    public Ellipse(Ellipse ellipse) {
        this(ellipse.getA(), ellipse.getB());
    }

    /**
     * Setter for A
     *
     * @param a Value to set
     */
    public void setA(int a) {
        if (a == 0)
            throw new ArithmeticException("Ellipse X-radius (A) cannot be 0");
        else
            this.a = a;
    }

    /**
     * Getter for A
     *
     * @return A
     */
    public int getA() {
        return a;
    }

    /**
     * Setter for A
     *
     * @param b Value to set
     */
    public void setB(int b) {
        if (b == 0)
            throw new ArithmeticException("Ellipse Y-radius (B) cannot be 0");
        else
            this.b = b;
    }

    /**
     * Getter for B
     *
     * @return B
     */
    public int getB() {
        return b;
    }

    /**
     * Calculates X coordinate from Y coordinate
     *
     * @param y Y coordinate
     * @return X coordinate
     */
    public double getXFromY(int y) {
        return a * Math.sqrt(1 - y * y / b / b);
    }

    /**
     * Calculates Y coordinate from X coordinate
     *
     * @param x X coordinate
     * @return Y coordinate
     */
    public double getYFromX(int x) {
        return a * Math.sqrt(1 - x * x / a / a);
    }

    /**
     * Clones ellipse to a new entity
     *
     * @return Cloned entity
     * @throws CloneNotSupportedException If cannot clone entity
     */
    @Override
    protected Ellipse clone() throws CloneNotSupportedException {
        return (Ellipse) super.clone();
    }

    /**
     * Represents ellipse as a string
     *
     * @return Ellipse representation as a string
     */
    @Override
    public String toString() {
        return String.format("A = %d, B = %d", a, b);
    }

    /**
     * Checks does Object equals this
     *
     * @param obj Object to compare
     * @return Does Object equals this
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Ellipse))
            return false;
        if (obj == this)
            return true;

        Ellipse ellipse = (Ellipse) obj;
        return a == ellipse.getA() && b == ellipse.getB();
    }

    /**
     * Builds hash code of entity
     *
     * @return Hash code of entity
     */
    @Override
    public int hashCode() {
        return ((a & 0xFF) << 16) + (b & 0xFF);
    }

}
