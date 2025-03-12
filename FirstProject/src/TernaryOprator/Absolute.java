package TernaryOprator;

import java.util.Scanner;

public class Absolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int num = sc.nextInt();
        int result = num>=0 ? num : -num;
        System.out.println("Absolute Value is : "+result);
    }
}
