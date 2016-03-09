package com.ssw;

public class Main {

    public static void main(String[] args) throws Exception {
        Ellipse ellipse = new Ellipse();

        ellipse.setA(7);
        ellipse.setB(2);

        System.out.println(String.format("A = %d", ellipse.getA()));
        System.out.println(String.format("B = %d", ellipse.getB()));
    }
}
