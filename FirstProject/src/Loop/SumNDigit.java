package Loop;

import java.util.Scanner;

public class SumNDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Sum of "+num+" digit is "+sumOfDigit(num));
    }
    public static int sumOfDigit(int num){
        int sum  = 0;
        while(num>0){
            sum += num%10;
            num = num/10;
        }
        return  sum;
    }
}
