package com.AbstractC;

public class Test {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Square s = new Square(4);
        System.out.printf("Circle area is %f\n",c.calculateArea());
        System.out.printf("Square area is %f",s.calculateArea());
    }
}
