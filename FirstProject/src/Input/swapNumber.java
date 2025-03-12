package Input;

import java.util.Scanner;

public class swapNumber {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int first  = sc.nextInt();
        System.out.print("enter second number :");
        int second  = sc.nextInt();
        int  third = 0;
        third = first;
        first = second;
        second = third;
        System.out.println("Swap number is first " + first  );
        System.out.println("Swap number is second " + second  );
    }
}
