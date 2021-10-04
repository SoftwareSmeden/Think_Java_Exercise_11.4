package com.company;

public class Rational {
    // Think Java - Exercise 11.4

    //1
    private int numerator;
    private int denominator;

    //2
    // Default constructor.
    Rational(){
        this.numerator = 0;
        this.denominator = 1;
    }

    //7
    // Constructor with two parameters.
    Rational(int num, int denon){
        this.numerator = num;
        this.denominator = denon;
    }

    //3
    public void printRational() {
        System.out.println("printRational method: " + this.numerator + "/" + this.denominator);
    }

    //6
    public String toString(){
        // toString method used to override to avoid getting the memory address in println.
        return "Numerator = " + numerator + ", Denominator = " + denominator;
    }

    //8
    public void negate(){
        // Not sure what they want me to do here.
    }

    //9
    public void invert(){
        System.out.println("invert method: " + this.denominator + "/" + this.numerator);
    }

    //10
    public double toDouble() {
        // Converting int to double in the return statement.
        return (double) this.numerator / this.denominator;
    }
}
