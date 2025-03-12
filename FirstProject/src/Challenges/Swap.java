package Challenges;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int firstNum = sc.nextInt();
        System.out.print("Enter the second number : ");
        int secondNum = sc.nextInt();
        int blank ;
        blank = firstNum;
        firstNum = secondNum;
        secondNum = blank;

        System.out.println("After swaping the first number is "+firstNum);
        System.out.println("After swaping the second number is "+secondNum);


    }
}
