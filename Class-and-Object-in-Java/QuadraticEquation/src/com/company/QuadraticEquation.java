package com.company;

public class QuadraticEquation {
    private double a,b,c;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double  getDiscriminant() {
        double delta;
        delta = (this.b * this.b) - (4 * this.a * this.c);
        return delta;
    }
    public double getRoot1() {
        double x1;
        x1 = (-this.b + Math.sqrt(this.getDiscriminant()))/(2*this.a);
        return x1;
    }
    public double getRoot2() {
        double x2;
        x2 = (-this.b - Math.sqrt(this.getDiscriminant()))/(2*this.a);
        return x2;
    }
}
