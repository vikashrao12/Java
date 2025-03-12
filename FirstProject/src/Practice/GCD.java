package Practice;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter  the number :");
        int first = input.nextInt();
        System.out.print("Enter  the number :");
        int second = input.nextInt();
        System.out.println("GCD " + first + " and " + second + " is "+ GCD(first,second));
    }
    public static int GCD(int first , int second){
        int gcd = 1;
        int i = 2;
        while(i<=first){
            if (first % i == 0 && second % i == 0){
                gcd =  i;
            }
            i++;
        }
        return gcd;
    }
}
