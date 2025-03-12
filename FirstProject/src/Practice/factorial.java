package Practice;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter  the number :");
        int num = input.nextInt();
        System.out.println("factorial " + num + " is " + factorial(num));


    }
     public static int factorial(int num){
        int i  = 1;
        int fact  = 1;
        while (i<=num){
            fact *= i;
            i++;
        }
        return fact;
     }
     public static void  input(){
         Scanner input = new Scanner(System.in);
         System.out.print("Enter  the number :");
         int num = input.nextInt();

     }
}