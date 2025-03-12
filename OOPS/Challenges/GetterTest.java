package Challenges;

import ClaasAndObject.Car;
import GetterSetter.CarA;

public class GetterTest {

    public static void main(String[] args) {
        CarA obj = new CarA("red","swidt123",3,7000);
        System.out.println(obj.getColor());
        obj.setColor("blue");
        System.out.println(obj.getColor());

    }
}
