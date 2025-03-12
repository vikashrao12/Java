package Loop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int factorial = factorial(num);
        System.out.println("Factorial "+num+" is: "+factorial);
    }
    public static int factorial(int num){
        int i = 1;
        int fact = 1;
        while(i<=num){
            fact = fact *i;
            i++;
        }
        return fact;
    }
}
