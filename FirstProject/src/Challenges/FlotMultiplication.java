package Challenges;

import java.util.Scanner;

public class FlotMultiplication {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first float number : ");
        float firstNum = sc.nextFloat();
        System.out.println("Enter second float number : ");
        float secondNum = sc.nextFloat();
        float mul =firstNum*secondNum;
        System.out.println("Multiplication of two float number is : "+mul);

    }
}
