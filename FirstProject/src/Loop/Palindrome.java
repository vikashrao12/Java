package Loop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if (palindrome(num)){
            System.out.println("your number is palindrome ");
        }
        else {
            System.out.println("Your number is not palindrome");
        }

    }
    public static boolean palindrome(int num){
        int newnum = 0;
        int numCopy = num;
        int i = 0;
        while(num>0){
            int digit = num%10;
            newnum = newnum * 10 + digit;
            num /= 10;


        }
        return newnum==numCopy;
    }
}
