package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle crl = new Circle(5.5);
        Rectangle ret = new Rectangle(5,10);

        double crlArea = Math.PI * Math.pow(crl.radius ,2);
        double retArea = ret.breath * ret.length;

        System.out.printf("Area is Circle is %f %n" ,crlArea);
        System.out.printf("Area is Rectangle is %f ",retArea);

    }
}
