package com.ssw;

public class Main {

    public static void main(String[] args) throws Exception {
        Ellipse ellipse = new Ellipse(7, 2);

        Ellipse ellipse1 = new Ellipse(ellipse);

        Ellipse ellipse2 = ellipse.clone();

        ellipse2.setA(45);

        System.out.println(String.format("A = %d", ellipse2.getA()));
        System.out.println(String.format("B = %d", ellipse2.getB()));

        System.out.println();
        System.out.println(ellipse.toString());

        System.out.println();
        System.out.println(ellipse1.equals(ellipse));

        System.out.println();
        System.out.println(ellipse.hashCode());
        System.out.println(ellipse1.hashCode());
    }
}
