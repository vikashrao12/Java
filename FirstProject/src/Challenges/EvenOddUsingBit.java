package Challenges;

import java.util.Scanner;

public class EvenOddUsingBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();

        if ((num & 1) ==1){
            System.out.println("number is odd ");
        }
        else {
            System.out.println("Number is even");
        }
    }
}
