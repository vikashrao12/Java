package Loop;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= 5, guess;
        do {
            System.out.print("enter the number between 1 to 10 :");
            guess = sc.nextInt();
        }while (num != guess);
        System.out.println("you have successfully guess the number : ");
    }
}
