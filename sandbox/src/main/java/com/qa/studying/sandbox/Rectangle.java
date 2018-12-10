package com.qa.studying.sandbox;

public class Rectangle {

   public double a;
   public double b;

    public Rectangle() {

    }

    public Rectangle (double a, double b){
       this.a = a;
       this.b = b;
   }
   public  double area() {
        if (a > 0 && b > 0) {
            return a * b;
        } else {
            throw new IllegalArgumentException("Sides should be > 0");
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
