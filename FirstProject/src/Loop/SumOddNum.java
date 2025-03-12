package Loop;

import java.util.Scanner;

public class SumOddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int  num = sc.nextInt();

        int sum = 0;
        int i = 1;
        while(i<=num){
            sum += i;
            i +=2;

        }
        System.out.println("Sum of odd numbers is :"+sum);
    }
}
