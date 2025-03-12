package Practice;

import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter  the number :");
        int num = input.nextInt();
        System.out.println("Sum of the digit " + num + " is " + sumOfDigits(num) );

    }
    public static int sumOfDigits(int num){
        int sum = 0;
        while (num>0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }

}
