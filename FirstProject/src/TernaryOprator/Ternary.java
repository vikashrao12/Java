package TernaryOprator;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number :");
        int num1 = sc.nextInt();
        System.out.println("enter the second number :");
        int num2 = sc.nextInt();
//        int greaterNumber;
//
//        if (num1>num2){
//            greaterNumber = num1;
//        }
//        else {
//            greaterNumber = num2;
//        }

        int greaterNumber = num1 > num2 ? num1 : num2;
        System.out.println(greaterNumber + " is the greater number ");
    }
}
