package Loop;

import java.awt.*;
import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to print table :");
        int num = sc.nextInt();
        for (int i = 1 ; i<=10;i++){
            System.out.println( num + " X " +i + " = " + num*i);
        }
    }
}
