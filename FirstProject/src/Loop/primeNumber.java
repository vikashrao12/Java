package Loop;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        System.out.println("your number is " + (isPrime(num)? "prime" : "not prime " ));

    }

    public static boolean isPrime(int num ){
       for (int i = 2 ; i<num; i++){
           if (num % i == 0){
               return false;
           }
       }
       return true;
    }
}
