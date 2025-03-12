package Loop;

import java.util.Scanner;

public class SumNNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Sum of "+num+" is :"+sumOfNDigits(num));
    }
    public static int sumOfNDigits(int num){
        int i = 1;
        int sum =  0;
        while(i<=num){
            sum += i;
            i++;
        }
        return sum;
    }
}
