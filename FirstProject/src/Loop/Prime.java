package Loop;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
       if (prime(num)){
           System.out.println("your number is prime ");
       }
       else {
           System.out.println(" not a prime number ");
       }

    }
    public static boolean prime(int num){
        int i=2;
        while(i<num){
            if(num%i==0){
              return false;
            }
            i++;
        }
        return true;

    }

}
