package Loop;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int first = sc.nextInt();
        System.out.print("Enter the number: ");
        int second = sc.nextInt();
        System.out.println("GCD "+first + " and "+second+" is : "+gcdIs(first,second));
    }
    public static int gcdIs(int first,int second){
        int gcd = 1;
        int i = 2;
        int least = least(first ,second);
        while(i<=least){
            if (first % i==0 && second % i ==0){
                gcd = i;

            }
            i++;
        }
        return  gcd;
    }
    public static int least(int first , int second){
        if(first<second)
            return first;
        else
            return second;
    }
}
