package com.company;

public class Square  extends  Figure implements  Drawable{
    private double sideA;

    public Square(double sideA) {
        super("Квадрат");
        this.sideA = sideA;
    }

    @Override
    public String draw() {
        return "\u2B1B";
    }

    @Override
    public double calculatePerimeter() {
        return sideA * 4;
    }
}
