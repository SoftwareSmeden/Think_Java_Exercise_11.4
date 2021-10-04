package com.company;

public class Main {
    // Think Java - Exercise 11.4

    //4
    public static void main(String[] args) {

    Rational rational = new Rational(19,7);

    //3
    rational.printRational();

    //6
    System.out.println("toString method: " + rational);

    //8
    rational.negate();

    //9
    rational.invert();

    //10
    rational.toDouble();
    System.out.printf("toDouble method: Result = %.2f ", rational.toDouble());

    //11 and 12 is too difficult for now.

    }

}


