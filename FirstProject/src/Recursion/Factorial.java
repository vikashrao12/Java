package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num = sc.nextInt();
        System.out.println("your factorial is : " +Fact(num));

    }

    public static long Fact(int num){
        if (num == 1){
            return 1;
        }
        return num * Fact(num-1);
    }
}
