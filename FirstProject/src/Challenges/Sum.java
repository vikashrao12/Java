package Challenges;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.print("Enter your first number : ");
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        System.out.print("Enter your second number : ");
        int second = sc.nextInt();
        int sum = first+second ;
        System.out.println("Sum of two number is " +sum);
    }
}
