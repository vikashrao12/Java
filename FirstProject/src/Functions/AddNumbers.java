package Functions;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        greet();
        int first = readNumber();
        int second = readNumber();
        int sum = first + second;
        System.out.println("Sum of two number is :"+sum);

    }

    public static  int readNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:");
        int number = sc.nextInt();
        return number;
    }
    public static void greet(){
        System.out.println("welcome to add two number...");
    }
}
