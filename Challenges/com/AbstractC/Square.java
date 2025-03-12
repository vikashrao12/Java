package com.AbstractC;

public class Square extends Shape{

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }


    @Override
    public double calculateArea() {
        return Math.pow(side,2);

    }
}
