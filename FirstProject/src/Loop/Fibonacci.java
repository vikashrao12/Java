package Loop;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Fibonacci series is here : ");
        fibonacci(num);

    }
    public static void fibonacci(int num){
        if (num<0) return;
        System.out.print("0 ");
        if (num==0) return;
        System.out.print("1 ");

        int first = 0, second =1;

        while(first + second <=num){
            int third = first +second ;
            System.out.print(third+ " ");
            first = second ;
            second = third;
        }
    }
}
