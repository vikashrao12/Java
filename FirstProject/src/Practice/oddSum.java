package Practice;

import java.util.Scanner;

public class oddSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to sum of the odd number :");
        int num  = sc.nextInt();
        System.out.println("OddSum till " + num + " number is " + oddSum(num));

    }
    public static int oddSum(int num){
        int i = 1;
        int sum = 0;
        while (i<=num){
            sum = sum+i;
            i += 2;

        }
        return sum;

    }
}
