package Challenges;

import java.util.Scanner;

public class TicketDiscount {
    public static void main(String[] args) {
        System.out.println("Welcome to ticket discount center ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Are you a female? , (ture/false)");
        boolean isFemale = sc.nextBoolean();

        if(age<5){
            System.out.println("You got a 75% discount ");
        } else if (isFemale) {
            System.out.println("you got 50% discount ");
            
        } else if (age>60 && !isFemale){
            System.out.println("you got 25% discount ");
        }
        else {
            System.out.println("you got no discount");
        }
    }
}