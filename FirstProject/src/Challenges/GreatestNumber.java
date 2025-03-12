package Challenges;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter your first number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter your first number : ");
        int num3 = sc.nextInt();
        if(num1 >= num2 && num1>= num3){
            System.out.println(num1+" Num1 is Greatest Number");
        }
        else if ( num2>=num3) {
            System.out.println(num2+" Num2 is Greatest Number ");

        }
        else  {
            System.out.println( num3+" Num3 is Greatest Number");

        }
    }
}
